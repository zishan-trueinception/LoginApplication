package com.example.androidprac.presentataion.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R
import com.example.androidprac.presentataion.components.CardComponent
import com.example.androidprac.presentataion.components.Carousel
import com.example.androidprac.presentataion.components.ProductCardComp

object Dimentions {
    val xSm: Dp = 8.dp
    val xxSm: Dp = 4.dp
}

object Colors {
    val ShadesOfGray400: Color = Color(0xFFA3A3A3)
    val textActive: Color = Color(0xDE000000)
}

// home screen
@Preview
@Composable
fun HomeScreen() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(start = 16.dp, end = 16.dp)

    ) {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 0.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp, Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                OutlinedTextField(
                    modifier = Modifier.weight(1f),
                    value = "", onValueChange = {},
                    placeholder = { Text(text = "Search for Parts") },
                    shape = RoundedCornerShape(999.dp),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.newkilo),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(23.00031.dp)
                                .height(20.90515.dp)
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { }) {
                            Image(painter = painterResource(id = R.drawable.mic),
                                contentDescription = "searchIcon",
                                modifier = Modifier
                                    .padding(1.dp)
                                    .size(24.dp))
                        }
                    }
                )
                IconButton(onClick = { }, modifier = Modifier.size(50.dp)) {
                    Image(painter = painterResource(id = R.drawable.newavatar),
                        contentDescription = "profileAvatar",
                    )
                }
            }
        }
        item {
            Carousel()
        }

        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()
                //.height(201.60001.dp)

            ) {
                Text(
                    text = "Top Categories",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Colors.textActive,
                    )
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(
                        Dimentions.xSm,
                        Alignment.Start
                    ),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .border(width = 1.dp, color = Colors.ShadesOfGray400)
                        .fillMaxWidth()
                        .height(2.dp)
                )
                {}
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
                            imageResId = R.drawable.wires
                        )
                        CardComponent(
                            onClick = { },
                            text = "Cameras & Sensors",
                            imageResId = R.drawable.camera
                        )
                        CardComponent(
                            onClick = { },
                            text = "Development Boards",
                            imageResId = R.drawable.passive
                        )
                        CardComponent(
                            onClick = { },
                            text = "Raspberry Pi",
                            imageResId = R.drawable.raspberry
                        )
                        CardComponent(
                            onClick = { },
                            text = "Motors & Actuators",
                            imageResId = R.drawable.actuator
                        )
                    }
                }
            }
        }
        item {
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Text(
                    text = "Top Products",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Colors.textActive,
                    )
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(Dimentions.xSm, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .border(width = 1.dp, color = Colors.ShadesOfGray400)
                        .fillMaxWidth()
                        .height(2.dp)
                )
                {}
                LazyRow {
                    item {
                        ProductCardComp(
                            title = "Development Boards",
                            imageResId = R.drawable.stack,
                            productname = "Arduino Nano RP2040",
                            deliverytype = "free delivery",
                            view = "1563 reviews",
                            offerprice = "",
                            oldprice = "",
                            price = "",
                            onClick = {},
                            rating = "4.9",
                            stockStatus = "Out of Stock"
                        )
                        ProductCardComp(
                            title = "raspberry pi",
                            imageResId = R.drawable.raspberry,
                            productname = "Raspberry PI 4 Model B With 4GB RAM",
                            deliverytype = "free delivery",
                            view = "1563 reviews",
                            offerprice = "₹ 5,999.00",
                            oldprice = "₹ 6,400.00",
                            price = "",
                            onClick = {},
                            rating = "4.8",
                            stockStatus = "Out of Stock"
                        )
                        ProductCardComp(
                            title = "3D Printers",
                            imageResId = R.drawable.printer,
                            productname = "3D Printer Extruder 0.5mm nozzle",
                            deliverytype = "free delivery",
                            view = "1563 reviews",
                            offerprice = "",
                            oldprice = "",
                            price = "",
                            onClick = {},
                            rating = "4.8",
                            stockStatus = "Out of Stock"
                        )
                        ProductCardComp(
                            title = "Sensors & Cameras",
                            imageResId = R.drawable.sensor,
                            productname = "3D Printer Extruder 0.5mm nozzle",
                            deliverytype = "free delivery",
                            view = "1563 reviews",
                            offerprice = "",
                            price = "₹ 6,400.00",
                            oldprice = "",
                            onClick = {},
                            rating = "4.8",
                            stockStatus = "Out of Stock"
                        )
                        ProductCardComp(
                            title = "Development Boards",
                            imageResId = R.drawable.arduino,
                            productname = "Original Arduino UNO Atmega325u",
                            deliverytype = "free delivery",
                            view = "1563 reviews",
                            offerprice = "",
                            oldprice = "",
                            price = "₹ 950.00",
                            onClick = {},
                            rating = "4.8",
                            stockStatus = "Out of Stock"
                        )
                    }
                }
            }
        }
    }
}