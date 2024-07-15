
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
    val ShadesOfGray300: Color = Color(0xFFD4D4D4)
    val primary500: Color = Color(0xFF6366F1)
    val textIconographyDarkActive: Color = Color(0xDEFFFFFF)
    val textDisabled: Color = Color(0x61000000)
    val Green500: Color = Color(0xFF4CAF50)
}


@Composable
fun HomePage() {
    LazyColumn {
        item {
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
                        .background(Color.White)
                        .padding(start = 16.dp, end = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(0.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    // Child views.
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 4.dp, top = 2.dp, end = 16.dp, bottom = 2.dp),
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
                        verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            //.width(Variables.MobileView)
                            .fillMaxWidth()
                            .height(939.66534.dp)
                        //.padding(start = 4.dp, end = 16.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                //.border(width = 1.dp, color = Variables.ShadesOfGray400)
                                .fillMaxWidth()
                                .height(32.dp)
                                .padding(
                                    start = Variables.xSm,
                                    top = Variables.xxSm,
                                    end = Variables.xSm,
                                    bottom = Variables.xxSm
                                ),
                            horizontalArrangement = Arrangement.spacedBy(
                                Variables.xSm,
                                Alignment.Start
                            ),
                            verticalAlignment = Alignment.CenterVertically,
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
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(201.60001.dp),
                            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                        ) {
                            LazyRow {
                                item {
                                    Column(
                                        verticalArrangement = Arrangement.spacedBy(
                                            Variables.xSm,
                                            Alignment.Top
                                        ),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        modifier = Modifier
                                            .width(113.6.dp)
                                            .height(145.60001.dp)
                                            .background(
                                                color = Variables.ShadesOfGray300,
                                                shape = RoundedCornerShape(size = Variables.xSm)
                                            )
                                            .padding(
                                                start = Variables.sm,
                                                top = Variables.xSm,
                                                end = Variables.sm,
                                                bottom = Variables.xSm
                                            )
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.eclips),
                                            contentDescription = "image description"
                                        )
                                        Text(
                                            text = "3D Printing",
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
                                    CardComponent(
                                        text = "Development Boards",
                                        imageResId = R.drawable.development
                                    )
                                    CardComponent(
                                        text = "Raspberry Pi",
                                        imageResId = R.drawable.raspberry
                                    )
                                    CardComponent(
                                        text = "Development Boards",
                                        imageResId = R.drawable.avatar
                                    )
                                    CardComponent(
                                        text = "Development Boards",
                                        imageResId = R.drawable.development
                                    )
                                    CardComponent(
                                        text = "Raspberry Pi",
                                        imageResId = R.drawable.raspberry
                                    )
                                    CardComponent(
                                        text = "Development Boards",
                                        imageResId = R.drawable.avatar
                                    )
                                }
                            }
                        }
                        Column(
                            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(939.66534.dp)
                            //.padding(start = 16.dp, end = 16.dp)
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(
                                    Variables.xSm,
                                    Alignment.Start
                                ),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    //.border(width = 1.dp, color = Color(0xFF9E9E9E))
                                    .fillMaxWidth()
                                    .height(32.dp)
                                    .padding(
                                        start = Variables.xSm,
                                        top = Variables.xxSm,
                                        end = Variables.xSm,
                                        bottom = Variables.xxSm
                                    )
                            ) {
                                Text(
                                    text = "Top Products",
                                    style = TextStyle(
                                        fontSize = 16.sp,
                                        lineHeight = 24.sp,
                                        fontFamily = FontFamily.SansSerif,
                                        fontWeight = FontWeight(600),
                                        color = Variables.textActive,
                                    ), modifier = Modifier
                                        .width(102.dp)
                                        .height(24.dp)
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(439.99997.dp)
                            ) {
                                LazyRow {
                                    item {
                                        Column(
                                            verticalArrangement = Arrangement.spacedBy(
                                                12.dp,
                                                Alignment.Top
                                            ),
                                            horizontalAlignment = Alignment.Start,
                                            modifier = Modifier
                                                .width(224.dp)
                                                .height(384.dp)
                                                .padding(
                                                    start = 12.dp,
                                                    top = 8.dp,
                                                    end = 12.dp,
                                                    bottom = 8.dp
                                                )
                                        ) {
                                            Text(
                                                text = "Development Boards",
                                                style = TextStyle(
                                                    fontSize = 14.sp,
                                                    lineHeight = 20.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    fontStyle = FontStyle.Italic,
                                                    color = Variables.textInactive,
                                                ),
                                                modifier = Modifier
                                                    .width(129.dp)
                                                    .height(20.dp)
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.stack),
                                                contentDescription = "stacImage",
                                                //contentScale = ContentScale.FillBounds
                                            )
                                            Text(
                                                text = "Arduino Nano RP2040",
                                                style = TextStyle(
                                                    fontSize = 16.sp,
                                                    lineHeight = 20.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    color = Variables.textActive,
                                                ), modifier = Modifier
                                                    .width(180.dp)
                                                    .height(20.dp)
                                            )
                                            Text(
                                                text = "free delivery",
                                                style = TextStyle(
                                                    fontSize = 12.sp,
                                                    lineHeight = 16.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    fontStyle = FontStyle.Italic,
                                                    color = Variables.textActive,
                                                ), modifier = Modifier
                                                    .width(65.dp)
                                                    .height(16.dp)
                                            )
                                            Row(
                                                horizontalArrangement = Arrangement.spacedBy(
                                                    4.dp,
                                                    Alignment.CenterHorizontally
                                                ),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.badges),
                                                    contentDescription = "badges",
                                                    modifier = Modifier
                                                        .width(39.dp)
                                                        .height(20.dp)
                                                )
                                                Text(
                                                    text = "1563 reviews",
                                                    style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontWeight = FontWeight(400),
                                                        fontStyle = FontStyle.Italic,
                                                        color = Variables.textInactive,
                                                    ), modifier = Modifier
                                                        .width(69.dp)
                                                        .height(16.dp)
                                                )
                                            }
                                            Image(
                                                painter = painterResource(id = R.drawable.badgetwo),
                                                contentDescription = "OutOfStock",
                                                modifier = Modifier
                                                    .width(82.dp)
                                                    .height(15.dp)
                                            )
                                        }
                                        Column(
                                            verticalArrangement = Arrangement.spacedBy(
                                                12.dp,
                                                Alignment.Top
                                            ),
                                            horizontalAlignment = Alignment.Start,
                                            modifier = Modifier
                                                .width(224.dp)
                                                .height(384.dp)
                                                .padding(
                                                    start = 12.dp,
                                                    top = 8.dp,
                                                    end = 12.dp,
                                                    bottom = 8.dp
                                                )
                                        ) {
                                            Text(
                                                text = "raspberry pi",
                                                style = TextStyle(
                                                    fontSize = 14.sp,
                                                    lineHeight = 20.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    fontStyle = FontStyle.Italic,
                                                    color = Variables.textInactive,
                                                ),
                                                modifier = Modifier
                                                    .width(129.dp)
                                                    .height(20.dp)
                                            )
                                            Image(
                                                painter = painterResource(id = R.drawable.raspnew),
                                                contentDescription = "raspImage",
                                                modifier = Modifier
                                                    .width(200.dp)
                                                    .height(180.dp),
                                                contentScale = ContentScale.FillBounds
                                            )
                                            Text(
                                                text = "Raspberry PI 4 Model B With 4GB RAM",
                                                style = TextStyle(
                                                    fontSize = 16.sp,
                                                    lineHeight = 20.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    color = Variables.textActive,
                                                ), modifier = Modifier
                                                    .width(180.dp)
                                                    .height(40.dp)
                                            )
                                            Text(
                                                text = "free delivery",
                                                style = TextStyle(
                                                    fontSize = 12.sp,
                                                    lineHeight = 16.sp,
                                                    fontFamily = FontFamily.SansSerif,
                                                    fontWeight = FontWeight(400),
                                                    fontStyle = FontStyle.Italic,
                                                    color = Variables.textActive,
                                                ), modifier = Modifier
                                                    .width(65.dp)
                                                    .height(16.dp)
                                            )
                                            Row(
                                                horizontalArrangement = Arrangement.spacedBy(
                                                    4.dp,
                                                    Alignment.CenterHorizontally
                                                ),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Image(
                                                    painter = painterResource(id = R.drawable.badges),
                                                    contentDescription = "badges",
                                                    modifier = Modifier
                                                        .width(39.dp)
                                                        .height(20.dp)
                                                )
                                                Text(
                                                    text = "1563 reviews",
                                                    style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontWeight = FontWeight(400),
                                                        fontStyle = FontStyle.Italic,
                                                        color = Variables.textInactive,
                                                    ), modifier = Modifier
                                                        .width(69.dp)
                                                        .height(16.dp)
                                                )
                                            }
                                            Row(
                                                horizontalArrangement = Arrangement.spacedBy(
                                                    4.dp,
                                                    Alignment.CenterHorizontally
                                                ),
                                                verticalAlignment = Alignment.CenterVertically
                                            ) {
                                                Text(
                                                    text = "₹ 6,400.00",
                                                    style = TextStyle(
                                                        fontSize = 12.sp,
                                                        lineHeight = 16.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontWeight = FontWeight(400),
                                                        color = Variables.textDisabled,
                                                        textDecoration = TextDecoration.LineThrough,
                                                    ), modifier = Modifier
                                                        .width(58.dp)
                                                        .height(16.dp)
                                                )
                                                Text(
                                                    text = "₹ 5,999.00",
                                                    style = TextStyle(
                                                        fontSize = 14.sp,
                                                        lineHeight = 20.sp,
                                                        fontFamily = FontFamily.SansSerif,
                                                        fontWeight = FontWeight(700),
                                                        color = Variables.Green500,
                                                    ), modifier = Modifier
                                                        .width(68.dp)
                                                        .height(20.dp)
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
        }
    }
}




