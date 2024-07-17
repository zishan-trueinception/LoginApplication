

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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R
import com.example.androidprac.loginscreens.CardComponent
import com.example.androidprac.loginscreens.ProductCardComp

object Variables {
    val MobileView: Dp = 430.dp
    val ShadesOfGray400: Color = Color(0xFFA3A3A3)
    val textInactive: Color = Color(0x99000000)
    val xSm: Dp = 8.dp
    val xxSm: Dp = 4.dp
    val textActive: Color = Color(0xDE000000)
    val sm: Dp = 12.dp
    val ShadesOfGray300: Color = Color(0xFFD4D4D4)
    val primary500: Color = Color(0xFF6366F1)
    val textIconographyDarkActive: Color = Color(0xDEFFFFFF)
    val textDisabled: Color = Color(0x61000000)
    val Green500: Color = Color(0xFF4CAF50)
}


@Composable
fun HomeScreen() {
    LazyColumn {
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(start = 4.dp, end = 4.dp),
                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, top = 2.dp, end = 8.dp, bottom = 0.dp),
                        horizontalArrangement = Arrangement.spacedBy(24.dp, Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
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
                                .width(60.dp)
                                .height(60.dp)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.imagehd),
                        contentDescription = "image description",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                    Column(
                        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(939.66534.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(30.dp)
                                .padding(
                                    start = Variables.xSm,
                                    top = Variables.xxSm,
                                    //end = Variables.xSm,
                                    //bottom = Variables.xxSm
                                ),

                        ) {
                            Text(
                                text = "Top Categories",
                                style = TextStyle(
                                    fontSize = 16.sp,
                                    lineHeight = 24.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight(600),
                                    color = Variables.textActive,
                                )
                            )
                            Row (
                                horizontalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .border(width = 1.dp, color = Variables.ShadesOfGray400)
                                    .fillMaxWidth()
                                    .height(2.dp)
                            )
                            //.padding(start = Variables.xSm, end = Variables.xSm, bottom = Variables.xxSm))
                            {}

                        }

                        LazyRow {
                            item {
                                CardComponent(
                                    onClick = { },
                                    text = "3D Printing",
                                    imageResId = R.drawable.eclips
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Development Boards",
                                    imageResId = R.drawable.development
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Raspberry Pi",
                                    imageResId = R.drawable.raspberry
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Development Boards",
                                    imageResId = R.drawable.avatar
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Development Boards",
                                    imageResId = R.drawable.development
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Raspberry Pi",
                                    imageResId = R.drawable.raspberry
                                )
                                CardComponent(
                                    onClick = { },
                                    text = "Development Boards",
                                    imageResId = R.drawable.avatar
                                )
                            }
                        }
                        Column(
                            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(939.66534.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(30.dp)
                                    .padding(
                                        start = Variables.xSm,
                                        top = Variables.xxSm,
                                        //end = Variables.xSm,
                                        //bottom = Variables.xxSm
                                    ),

                                ) {
                                Text(
                                    text = "Top Products",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        lineHeight = 24.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight(600),
                                        color = Variables.textActive,
                                    )
                                )
                                Row (
                                    horizontalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .border(width = 1.dp, color = Variables.ShadesOfGray400)
                                        .fillMaxWidth()
                                        .height(2.dp)
                                )
                                //.padding(start = Variables.xSm, end = Variables.xSm, bottom = Variables.xxSm))
                                {}

                            }
                            LazyRow {
                                item {
                                    ProductCardComp(
                                        title = "Development Boards",
                                        imageResId = R.drawable.stack,
                                        productname = "Arduino Nano RP2040",
                                        deliverytype = "free delivery",
                                        badges1 = R.drawable.badges,
                                        badges2 = R.drawable.badgetwo,
                                        view = "1563 reviews",
                                        price = "",
                                        oldprice = "",
                                        onClick = {}
                                    )
                                    ProductCardComp(
                                        title = "raspberry pi",
                                        imageResId = R.drawable.raspberry,
                                        productname = "Raspberry PI 4 Model B With 4GB RAM",
                                        deliverytype = "free delivery",
                                        badges1 = R.drawable.badges,
                                        badges2 = null,
                                        view = "1563 reviews",
                                        price = "",
                                        oldprice = "",
                                        onClick = {}
                                    )
                                    ProductCardComp(
                                        title = "raspberry pi",
                                        imageResId = R.drawable.raspberry,
                                        productname = "Raspberry PI 4 Model B With 4GB RAM",
                                        deliverytype = "free delivery",
                                        badges1 = R.drawable.badges,
                                        badges2 = null,
                                        view = "1563 reviews",
                                        price = "",
                                        oldprice = "",
                                        onClick = {}
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}




