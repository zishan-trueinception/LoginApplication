

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


// Define a composable function for the card
@Composable
fun CardComponent(
    text: String,
    imageResId: Int
) {
    Surface(
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(113.6.dp)
                .height(145.60001.dp)
                .background(color = Color.White, shape = RoundedCornerShape(size = Variables.xSm))
                .padding(
                    start = Variables.sm,
                    top = Variables.xSm,
                    end = Variables.sm,
                    bottom = Variables.xSm
                )
        )
        {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null
            )
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    color = Variables.textInactive,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(89.6.dp)
                //.height(16.dp)
            )
        }
    }
}