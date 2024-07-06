package com.example.androidprac.androidpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object color {
    val primary = Color.Blue
    val secondary = Color.Green
    val tertiary = Color.Red
}

@Composable
fun MainScreen() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        ButtonComp(
            onClick = { },
            shape = RoundedCornerShape(16.dp),
            enabled = true,
            style = TextStyle(Color.White),
            colors = ButtonDefaults.buttonColors(color.tertiary)
        )
    }
}

// Reusable Button Component Function with default values
@Composable
fun ButtonComp(
    text: String = "Button",
    onClick: () -> Unit,
    enabled: Boolean = true,
    fontSize: TextUnit = 16.sp,
    contentPadding: PaddingValues = PaddingValues(
        start = 16.dp,
        end = 16.dp,
        top = 0.dp,
        bottom = 0.dp
    ),
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(16.dp),
    style: TextStyle = TextStyle(fontSize = 16.sp, color = Color.Black),
    IconStart: @Composable (() -> Unit)? = null,
    IconEnd: @Composable (() -> Unit)? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(color.primary),
) {
    Button(
        onClick = onClick,
        enabled = enabled,
        modifier = modifier
            .width(147.dp)
            .height(48.dp),
        shape = shape,
        colors = colors
    )
    {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (IconStart != null) {
                IconStart()
            }
            Text(
                text = text,
                style = TextStyle(fontSize = fontSize, color = Color.Red),
            )
            if (IconEnd != null) {
                IconEnd()
            }
        }
    }
}

