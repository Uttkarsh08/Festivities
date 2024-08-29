package com.example.festivitiess.Events

import android.graphics.drawable.Icon
import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import com.example.festivitiess.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Event(
    val id: Int,
    val name: String,
    val price: String,
    @DrawableRes val imageUrl :  Int,
    val description: String
): Parcelable

val events = listOf(
    Event(
        id=1,
        name = "KITE FLYING FESTIVAL",
        price = "200 ONWARDS",
        imageUrl = R.drawable.img_5,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),
    Event(
        id=2,
        name = "MAHASHIVRATRI",
        price = "FREE",
        imageUrl = R.drawable.img_6,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),
    Event(
        id=3,
        name = "DANDIYA NIGHT",
        price = "400 ONWARDS",
        imageUrl = R.drawable.img_7,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),
    Event(
        id=4,
        name = "DIYA LIGHTING",
        price = "100 ONWARDS",
        imageUrl = R.drawable.img_8,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),
    Event(
        id=5,
        name = "GANESH CHATURTHI",
        price = "FREE",
        imageUrl = R.drawable.img_9,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),
    Event(
        id=6,
        name = "DURGA PUJA",
        price = "FREE",
        imageUrl = R.drawable.img_10,
        description = "Join us for a vibrant day of kite flying at the Soar High Kite Fest! Enjoy colorful kites, friendly competitions, and fun for all ages. Bring your family and friends to experience the joy of soaring high together."
    ),

)