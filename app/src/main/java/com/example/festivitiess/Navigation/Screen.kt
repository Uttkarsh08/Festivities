package com.example.festivitiess.Navigation

sealed class Screen(val route: String) {
    object LandingScreen: Screen("landingScreen")
    object HomeScreen: Screen("homeScreen")
    object EventsScreen: Screen("eventsScreen")
    object EventDetailScreen: Screen("eventDetailScreen/{eventId}")
}