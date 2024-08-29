package com.example.festivitiess.Events

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Icon
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.unit.dp

@Composable
fun EventScreen(
    events: List<Event>,
    onNavigateToEventDetail: (Event) -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.dp)
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.End
        ){
            Text(text = "MUMBAI")
            Icon(imageVector = Icons.Filled.LocationOn, contentDescription = null)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "FILTERS")
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item { DateDropDownMenu() }
            item { CategoryDropDownMenu() }
            item { PriceDropDownMenu() }
        }
        Spacer(modifier = Modifier.height(40.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(events){ event ->
                    EventCard(event = event){
                        selectedEvent->
                        onNavigateToEventDetail(selectedEvent)
                    }
                }

        }
    }
}

