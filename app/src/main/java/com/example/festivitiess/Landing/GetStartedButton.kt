package com.example.festivitiess.Landing

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.festivitiess.ui.theme.montSerretFamily

@Composable
fun GetStartedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White),
        shape = RoundedCornerShape(size = 55.dp),
        modifier = modifier,
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 10.dp,
            pressedElevation = 15.dp,
            disabledElevation = 0.dp
        )
    ) {
        Text(text = text, fontFamily = montSerretFamily, fontWeight = FontWeight.Bold)
    }
}