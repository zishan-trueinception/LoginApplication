package com.example.androidprac.presentataion.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Component for Top Products
@Composable
fun TopProductListItems(
    label: String,
    productName: String,
    image: DynamicImageSource,
    deliveryType: String,
    productCurrentPrice: String? = null,
    productOldPrice: String? = null,
    rating: String,
    stockStatus: String? = null,
    view: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier
            .padding(2.dp)
            .clip(shape = RoundedCornerShape(8.dp))
            .clickable(onClick = onClick)
            //.border(1.dp, Color.Gray, RoundedCornerShape(8.dp))
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier
                .width(200.dp)
                .height(384.dp)
                .padding(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // text for label
            Text(
                modifier = Modifier.width(129.dp),
                text = label,
                style = TextStyle(
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    fontStyle = FontStyle.Italic,
                    color = ProductCardColor.textInactive,
                )
            )
            // DynamicImage provides a flexible way to display images
            DynamicImage(
                imageSource = image,
                customization = ImageCustomization(
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .width(200.dp)
                        .height(180.dp)
                )
            )
            Text(
                modifier = Modifier
                    .width(180.dp)
                    .height(20.dp),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                text = productName,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 20.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    color = Color.Black
                )
            )
            Text(
                modifier = Modifier
                    .width(65.dp)
                    .height(16.dp),
                text = deliveryType,
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    fontStyle = FontStyle.Italic,
                    color = Color.Black,
                )
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RatingBadgeComp(rating = rating)
                Text(
                    text = view,
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        fontStyle = FontStyle.Italic,
                        color = ProductCardColor.textInactive,
                    )
                )
            }
            if (stockStatus != null) {
                StockBadgeComp(stock = stockStatus)
            } else {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(
                        8.dp,
                        Alignment.CenterHorizontally
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (productOldPrice != null) {
                        Text(
                            text = productOldPrice,
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(400),
                                color = ProductCardColor.textInactive,
                                textDecoration = TextDecoration.LineThrough
                            )
                        )
                    }
                    if (productCurrentPrice != null) {
                        Text(
                            text = productCurrentPrice,
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(400),
                                color = ProductCardColor.Green500
                            )
                        )
                    }
                }
            }
        }
    }
}