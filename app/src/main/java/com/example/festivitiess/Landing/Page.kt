package com.example.festivitiess.Landing

import androidx.annotation.DrawableRes
import com.example.festivitiess.R

data class Page(
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        description = "A LAND OF FESTIVALS",
        image = R.drawable.onboarding1
    ),
    Page(
        description = "India's culture is marked by vibrant festivals that reflect its spiritual richness and communal harmony.",
        image = R.drawable.onbording2
    ),
    Page(
        description = "India's culture is marked by vibrant festivals that reflect its spiritual richness and communal harmony.",
        image = R.drawable.onboarding3
    )
)