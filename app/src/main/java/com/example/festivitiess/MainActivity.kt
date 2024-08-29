package com.example.festivitiess

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.festivitiess.EventDeatil.EventDetailScreen
import com.example.festivitiess.Events.EventScreen
import com.example.festivitiess.Home.HomeScreen
import com.example.festivitiess.Landing.LandingScreen
import com.example.festivitiess.Navigation.EventApp
import com.example.festivitiess.ui.theme.FestivitiessTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            FestivitiessTheme {
                EventApp(navController = navController)
            }
        }
    }
}
