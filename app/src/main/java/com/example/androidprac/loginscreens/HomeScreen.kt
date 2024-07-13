import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R

object Variables {
    val MobileView: Dp = 430.dp
    val ShadesOfGray400: Color = Color(0xFFA3A3A3)
    val textInactive: Color = Color(0x99000000)
    val xSm: Dp = 8.dp
    val xxSm: Dp = 4.dp
    val textActive: Color = Color(0xDE000000)
    val sm: Dp = 12.dp
}


@Composable
fun HomePage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(0.dp)
    )
    {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .padding(start = 16.dp, end = 16.dp),
            verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // Child views.
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp, top = 16.dp, end = 16.dp, bottom = 2.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                // Child views.
                OutlinedTextField(
                    value = "", onValueChange = {},
                    placeholder = { Text(text = "Search for Parts") },
                    shape = RoundedCornerShape(999.dp),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.newkilo),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(22.00031.dp)
                                .height(20.90515.dp)
                        )
                    },
                    trailingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.mic),
                            contentDescription = "MicIcon", modifier = Modifier
                                .padding(1.dp)
                                .width(24.dp)
                                .height(24.dp)
                        )
                    }, modifier = Modifier
                        .height(50.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "AvatarIcon",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "image description",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(201.60001.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                // Child views.
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = Variables.ShadesOfGray400)
                        .fillMaxWidth()
                        .height(32.dp)
                        .padding(
                            start = Variables.xSm,
                            top = Variables.xxSm,
                            end = Variables.xSm,
                            bottom = Variables.xxSm
                        ),
                    horizontalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    // Child views.
                    Text(
                        text = "Top Category",
                        style = TextStyle(
                            fontSize = 16.sp,
                            lineHeight = 24.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight(600),
                            color = Variables.textActive,
                        )
                    )
                }
                Row(
                    modifier = Modifier
                        .width(113.6.dp)
                        .height(145.60001.dp),
                    horizontalArrangement = Arrangement.spacedBy(
                        8.dp,
                        Alignment.CenterHorizontally
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    LazyRow {
                        item {
                            Card(
                                onClick = { }, modifier = Modifier
                                    .width(113.6.dp)
                                    .height(145.60001.dp)
//                                    .background(
//                                        color = Variables.ShadesOfGray300,
//                                        shape = RoundedCornerShape(size = Variables.xSm)
//                                    )
                                    .padding(
                                        start = Variables.sm,
                                        top = Variables.xSm,
                                        end = Variables.sm,
                                        bottom = Variables.xSm
                                    )
                            )
                            {
                                Image(
                                    painter = painterResource(id = R.drawable.eclips),
                                    contentDescription = "eclips"
                                )
                                Text(
                                    text = "3D Printer",
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
                                        .height(16.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
