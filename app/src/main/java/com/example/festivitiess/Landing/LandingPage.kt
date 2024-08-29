package com.example.festivitiess.Landing

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import com.example.festivitiess.Landing.Dimens.MediumPadding1
import com.example.festivitiess.R
import com.example.festivitiess.ui.theme.montSerretFamily

@Composable
fun LandingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = page.image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.75f),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = buildAnnotatedString {
                if (page.image == R.drawable.onboarding1) {
                    append("A LAND OF\n\n")
                    withStyle(style = SpanStyle(fontSize = 50.sp)) {
                        append("FESTIVAL")
                    }
                } else {
                    append(page.description)
                }
            },
            fontSize = 19.sp,
            modifier = Modifier.padding(horizontal = MediumPadding1),
            fontFamily = montSerretFamily,
            color = colorResource(
                id = R.color.black
            )
        )


    }
}