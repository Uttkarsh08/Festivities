package com.example.festivitiess.Landing

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.festivitiess.Landing.Dimens.MediumPadding2
import com.example.festivitiess.Navigation.Screen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LandingScreen(
    onNavigate: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        val navController = rememberNavController()
        val pagerState = rememberPagerState(initialPage = 0) {
            pages.size
        }

        HorizontalPager(state = pagerState) { index ->
            LandingPage(page = pages[index])

        }
        Spacer(modifier = Modifier.weight(1f))
        val scope = rememberCoroutineScope()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = MediumPadding2)
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            GetStartedButton(text = "GET STARTED",
                onClick = {
                    onNavigate()
                },
                modifier = Modifier.padding(bottom = 50.dp,).size(width = 168.dp, height = 47.32.dp)
            )
        }
        LaunchedEffect(key1 = pagerState.currentPage) {
            snapshotFlow { pagerState.currentPage }.collect { page ->
                scope.launch {
                    delay(2000)
                    pagerState.animateScrollToPage(
                        page = pagerState.currentPage + 1
                    )
                }

            }

        }
    }

}