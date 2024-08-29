package com.example.festivitiess.EventDeatil

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.sharp.LocationOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.festivitiess.Events.Event
import com.example.festivitiess.Landing.GetStartedButton
import com.example.festivitiess.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventDetailScreen(
    event: Event,
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        TopAppBar(title = { Text(text = "Event Details") },
            navigationIcon = {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(Icons.Default.ArrowBack, contentDescription = null)
                }
            }
        )
        Spacer(modifier = Modifier.height(50.dp))
        Image(painter = painterResource(id = event.imageUrl), contentDescription = null, Modifier.size(250.dp))

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = event.name, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(30.dp))
        Text(text = event.description)
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Icon(imageVector = Icons.Default.LocationOn, contentDescription = null)
            Text(text = "MALAD WEST")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row {
            Icon(imageVector = Icons.Sharp.LocationOn, contentDescription = null)
            Text(text = "12th Sept, 12pm Onwards")
        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "₹"+event.price)

        Spacer(modifier = Modifier.height(30.dp))
        GetStartedButton(text = "BUY ONLINE", onClick = { /*TODO*/ })

    }
}