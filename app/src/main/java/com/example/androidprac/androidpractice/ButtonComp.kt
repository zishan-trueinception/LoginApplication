package com.example.androidprac.androidpractice

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

enum class ButtonType {
    DEFAULT,
    PRESSED,
    DISABLED
}

/* siddhant */
@Composable
fun ButtonComp(
    Text: String,
    onClick: () -> Unit,
    modifier: Modifier,
    fontFamily: FontFamily,
    fontSize: Int,
    fontWeight: FontWeight,
    type: ButtonType,
    color: Color,
    contentColor: Color,


    ) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .width(147.dp)
            .height(48.dp)
            .background(color = Color.Yellow, shape = RoundedCornerShape(size = 8.dp))
            .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp)
    ) {
        Text(
            text = Text,
            fontFamily = fontFamily,
            fontSize = fontSize.sp,
            fontWeight = fontWeight
        )
        if (type == ButtonType.PRESSED) {
            Text(
                text = Text,
                fontFamily = fontFamily,
                fontSize = fontSize.sp,
                fontWeight = fontWeight
            )
        }
    }
}