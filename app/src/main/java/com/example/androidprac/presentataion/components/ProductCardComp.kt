package com.example.androidprac.presentataion.components

import android.media.Rating
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.presentataion.screens.onboarding.Variables

// Define a data class for the card colors
object ProductCardColor {
    val textDisabled: Color = Color(0x61000000)
    val Green500: Color = Color(0xFF4CAF50)
    val textInactive: Color = Color(0x99000000)
}

// Define a composable function for the card
@Composable
fun ProductCardComp(
    title: String,
    imageResId: Int,
    productname: String,
    deliverytype: String,
    rating: String? = null,
    stockStatus:String? = null,
    view: String,
    offerprice: String,
    oldprice: String? = null,
    price: String? = null,
    onClick: () -> Unit,
) {
    Surface(
        color = Color.White
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .background(Color.White)
                .width(224.dp)
                //.height(384.dp)
                .padding(
                    start = 12.dp,
                    top = 8.dp,
                    end = 12.dp,
                    bottom = 8.dp
                )
                .clip(RoundedCornerShape(size = 10.dp))
                .clickable(onClick = onClick)
        ) {
            Text(
                text = title,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    fontStyle = FontStyle.Italic,
                    color = ProductCardColor.textInactive,
                ),
                modifier = Modifier
                    .width(129.dp)
                //.height(20.dp)
            )
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = "contentDescription"
            )

            Text(
                text = productname,
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                ), modifier = Modifier
                    .width(180.dp)
                //.height(40.dp)
            )
            Text(
                text = deliverytype,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    fontStyle = FontStyle.Italic,
                    color = Color.Black
                ), modifier = Modifier
                    .width(65.dp)
                //.height(16.dp)
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    4.dp,
                    Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                rating?.let {
                    RatingBadgeComp(rating = it)
                }
                Text(
                    text = view,
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        fontStyle = FontStyle.Italic,
                        color = Variables.textInactive,
                    ), modifier = Modifier
                        .width(69.dp)
                    //.height(16.dp)
                )
            }
//            badges2?.let { painterResource(id = it) }?.let {
//                Image(
//                    painter = it,
//                    contentDescription = "ContentDescription",
//                    modifier = Modifier
//                        .width(82.dp)
//                        .height(15.dp)
//                )
//            }
            stockStatus?.let {
                StockBadgeComp(stock = it)
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (price != null) {
                    Text(
                        text = price,
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight(400),
                        )
                    )
                } else {

//                }
//            }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            4.dp,
                            Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (oldprice!=null) {
                            Text(
                                text = oldprice,
                                style = TextStyle(
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight(400),
                                    color = ProductCardColor.textDisabled,
                                    textDecoration = TextDecoration.LineThrough,
                                ), modifier = Modifier
                                    .width(58.dp)
                                //.height(16.dp)
                            )
                        }else {
                            Text(
                                text = offerprice,
                                style = TextStyle(
                                    fontSize = 14.sp,
                                    lineHeight = 20.sp,
                                    fontFamily = FontFamily.SansSerif,
                                    fontWeight = FontWeight(700),
                                    color = ProductCardColor.Green500,
                                ), modifier = Modifier
                                    .width(68.dp)
                                //.height(20.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
