package com.example.festivitiess.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.festivitiess.EventDeatil.EventDetailScreen
import com.example.festivitiess.Events.Event
import com.example.festivitiess.Events.EventScreen
import com.example.festivitiess.Events.events
import com.example.festivitiess.Home.HomeScreen
import com.example.festivitiess.Landing.LandingScreen

@Composable
fun EventApp(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screen.LandingScreen.route) {
        composable(route = Screen.LandingScreen.route){
            LandingScreen(onNavigate = {
                navController.navigate(Screen.HomeScreen.route)
            })
        }
        composable(route = Screen.HomeScreen.route){
            HomeScreen(onEventClicked = {
                navController.navigate(Screen.EventsScreen.route)
            })
        }
        composable(route = Screen.EventsScreen.route){
            EventScreen(events = events) { selectedEvent ->
                navController.navigate(Screen.EventDetailScreen.route.replace("{eventId}", "${selectedEvent.id}"))
            }
        }
        composable(
            route = Screen.EventDetailScreen.route,
            arguments = listOf(navArgument("eventId") { type = NavType.IntType })
        ) { backStackEntry ->
            val eventId = backStackEntry.arguments?.getInt("eventId") ?: 0
            val event = events.find { it.id == eventId } ?: Event(0, "", "", 0, "")
            EventDetailScreen(event = event, navController = navController)
        }

    }

}
