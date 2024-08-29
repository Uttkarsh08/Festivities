package com.example.festivitiess.Events

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.festivitiess.R

@Composable
fun EventCard(
    event: Event,
    navigateToEventDetail: (Event) -> Unit
){
    Box(modifier = Modifier
        .fillMaxSize()
        .clickable { navigateToEventDetail(event) }
        .background(color = Color.Transparent)){
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painter = painterResource(id = event.imageUrl), contentDescription = null, Modifier.size(200.dp))
            Text(text = event.name)
            Text(text = "₹"+event.price)
            Spacer(modifier = Modifier.height(20.dp))
        }
    }

}