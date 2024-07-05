package com.example.androidprac.androidpractice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Enum class for different types of buttons
enum class Buttoncolor {
    PRIMARY,
    SECONDARY
}

@Composable
fun MainScreen() {
    Row(
        modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.CenterVertically
    ) {
        ButtonComp(
            text = "Button",
            onClick = {},
            style = TextStyle(fontSize = 16.sp, color = Color.Black),
            color = Buttoncolor.PRIMARY,
        )
    }
}

// Reusable Button Component Function with default values
@Composable
fun ButtonComp(
    text: String,
    onClick: () -> Unit,
    enabled: Boolean = true,
    color: Buttoncolor = Buttoncolor.SECONDARY,
    fontSize: TextUnit = 16.sp,
    fontWeight: FontWeight = FontWeight.Normal,
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    modifier: Modifier = Modifier,
    shape: RoundedCornerShape = RoundedCornerShape(16.dp),
    style: TextStyle = TextStyle(fontSize = 16.sp, color = Color.Black),
    IconStart: @Composable (() -> Unit)? = null,
    IconEnd: @Composable (() -> Unit)? = null,

    ) {

    // Button with default values
    Button(
        onClick = onClick,
        modifier = modifier
            .width(147.dp)
            .height(48.dp),
        enabled = true,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (color == Buttoncolor.SECONDARY) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary,
            contentColor = if (color == Buttoncolor.PRIMARY) MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.primary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (IconStart != null) {
                IconStart()
            }
            Text(
                text = text, style = TextStyle(Color.White)
            )
            if (IconEnd != null) {
                IconEnd()
            }
        }
    }
}
