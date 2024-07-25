package com.example.androidprac.presentataion.components

import android.media.Rating
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R

@Composable
fun RatingBadgeComp(rating: String){
    Row(modifier = Modifier
        .width(39.dp)
        .height(20.dp)
        .background(color = Color(0xFF6366F1), shape = RoundedCornerShape(size = 999.dp))
        .padding(start = 4.dp, top = 4.dp, end = 4.dp, bottom = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(modifier = Modifier
            .width(15.dp),
            text = rating,
            style = TextStyle(
                fontSize = 10.sp,
                lineHeight = 16.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(600),
                color = Color(0xDEFFFFFF),
                letterSpacing = 0.2.sp,
            )
        )
        Image(modifier = Modifier
            .padding(1.dp)
            .size(12.dp),
            painter = painterResource(id = R.drawable.starticon),
            contentDescription = "StartIcon"
        )

    }
}