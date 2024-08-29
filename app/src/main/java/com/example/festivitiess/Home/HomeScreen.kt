package com.example.festivitiess.Home

import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.festivitiess.Navigation.Screen
import com.example.festivitiess.R
import com.example.festivitiess.ui.theme.nunitoFamily


@Composable
fun HomeScreen(
    onEventClicked:()-> Unit,
) {
    val navController = rememberNavController()
    Box(modifier = Modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Image at the top
            Image(
                painter = painterResource(id = R.drawable.maharashtra),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.4f),
                contentScale = ContentScale.Crop,
                colorFilter = ColorFilter.colorMatrix(ColorMatrix().apply {setToScale(0.5f, 0.5f, 0.5f, 1f) // Adjust the values to control contrast
                })
            )

            // Text below the image
            LazyColumn(
                modifier = Modifier.padding(16.dp)
            ) {
                item {
                    Text(text = "Maharashtra's festivals showcase its rich cultural heritage, blending religious,cultural, and social celebrations. Key festivals include Ganesh Chaturthi, celebrated with grand idol immersions; Diwali, marked by lights and sweets; and Gudi Padwa, the Marathi New Year with its own rituals. Makar Sankranti features kite flying, while Holi is celebrated with vibrant colors. Dahi Handi during Janmashtami involves breaking curd pots with human pyramids. Rural festivals like Pola honor farmers and Narali Purnima marks the fishing season. The Pandharpur Wari pilgrimage reflects deep devotion. These festivals, whether urban or rural, highlight Maharashtra’s unity, diversity, and vibrant spirit.")
                    Spacer(modifier = Modifier.height(26.dp))

                    Text(text = "Maharashtra is a vibrant state in western India, offering a mix of cultural, historical, and natural attractions. Highlights include Mumbai’s iconic landmarks, the ancient Ajanta and Ellora caves, scenic hill stations like Mahabaleshwar, and pristine coastal spots like Alibaug. The state also boasts rich wildlife sanctuaries and a deep cultural heritage, making it a diverse and captivating destination for travelers.")

                }
            }

        }

        // Text overlaid on the image
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 140.dp),
            ) {
            Text(
                text = "MAHARASHTRA",
                modifier = Modifier
                    .align(Alignment.Center)
                    .background(Color.Transparent),
                color = Color.White,
                fontSize = 40.sp,
                fontFamily = nunitoFamily
            )
        }

        // Buttons at the top right, overlapping the image
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 26.dp)
                .align(Alignment.TopEnd),
            horizontalArrangement = Arrangement.End
        ) {
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "MUMBAI", color = Color.White, fontSize = 11.sp)
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
                Spacer(modifier = Modifier.width(1.dp))
            }
            TextButton(onClick = { /*TODO*/ }) {
                Text(text = "HOST EVENT", color = Color.White, fontSize = 11.sp)
                Spacer(modifier = Modifier.width(1.dp))
            }
            TextButton(onClick = { onEventClicked() },
                border = BorderStroke(2.dp, color = Color.White)
                ) {
                Text(text = "EVENTS", color = Color.White, fontSize = 11.sp)
                Spacer(modifier = Modifier.width(5.dp))
            }
        }


    }
}