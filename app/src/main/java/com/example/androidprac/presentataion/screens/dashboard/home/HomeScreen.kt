package com.example.androidprac.presentataion.screens.dashboard.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
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
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.androidprac.R
import com.example.androidprac.presentataion.components.TopCategoryListItem
import com.example.androidprac.presentataion.components.Carousel
import com.example.androidprac.presentataion.components.NewsletterComp
import com.example.androidprac.presentataion.components.ProductCardComp
import com.example.androidprac.presentataion.components.TopProductListItems
import java.util.Locale.Category

object Dimentions {
    val xSm: Dp = 8.dp
//    val xxSm: Dp = 4.dp
}

object Colors {
    val ShadesOfGray400: Color = Color(0xFFA3A3A3)
    val textActive: Color = Color(0xDE000000)
}

// home screen
@Composable
fun HomeScreen(homeViewModel: HomeViewModel = hiltViewModel()) {
    val topCategoriesUiState = homeViewModel.topCategoriesUiState.collectAsState().value
    val topProductUiState = homeViewModel.topProductUiState.collectAsState().value
    LaunchedEffect(key1 = Unit) {
        homeViewModel.getTopCategories()
    }
    LaunchedEffect(key1 = Unit) {
        homeViewModel.getTopProducts()
    }
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
                    modifier = Modifier
                        .weight(1f)
                        .height(55.dp),
                    value = "", onValueChange = {},
                    placeholder = { Text(text = "Search for Parts") },
                    shape = RoundedCornerShape(999.dp),
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.ic_newkilo),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(0.dp)
                                .width(23.00031.dp)
                                .height(20.90515.dp)
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { }) {
                            Image(
                                painter = painterResource(id = R.drawable.mic),
                                contentDescription = "searchIcon",
                                modifier = Modifier
                                    .padding(1.dp)
                                    .size(24.dp)
                            )
                        }
                    }
                )
                IconButton(onClick = { }, modifier = Modifier.size(50.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_avatar),
                        contentDescription = "profileAvatar",
                    )
                }
            }
        }
        item {
            //dagger hilt component
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
                LazyRow(modifier = Modifier.fillMaxWidth()) {
                    when (topCategoriesUiState) {
                        is TopCategoriesUiState.Error -> {
                            item {
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Text(text = topCategoriesUiState.message, color = Color.Red)
                                }

                            }
                        }

                        TopCategoriesUiState.Idle -> {
                            item {
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Text(text = "No Categories to Show")
                                }
                            }
                        }

                        is TopCategoriesUiState.Loading -> {
                            item {
                                LinearProgressIndicator(
                                    modifier = Modifier.fillMaxWidth(),
                                    progress = {
                                        topCategoriesUiState.progress
                                    })
                            }
                        }

                        is TopCategoriesUiState.Success -> {
                            items(topCategoriesUiState.data) { category ->
                                TopCategoryListItem(
                                    label = category.label,
                                    image = category.image,
                                    onClick = {},
                                )
                            }
                        }
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
                    when(topProductUiState){
                        is TopProductUiState.Error -> {
                            item {
                                Box(modifier = Modifier.fillMaxWidth()){
                                    Text(text = topProductUiState.message, color = Color.Red)
                                }
                            }
                        }
                        is TopProductUiState.Idle -> {
                            item {
                                Box(modifier = Modifier.fillMaxWidth()){
                                    Text(text = "No Products to Show")
                                }
                            }
                        }
                        is TopProductUiState.Loading -> {
                            item {
                                LinearProgressIndicator(
                                    modifier = Modifier.fillMaxWidth(),
                                    progress = {
                                        topProductUiState.progress
                                    })
                            }
                        }
                        is TopProductUiState.Success -> {
                            items(topProductUiState.data) { products ->
                                TopProductListItems(
                                    label = products.label,
                                    productName = products.productName,
                                    image = products.image,
                                    deliveryType = products.deliveryType,
                                    rating = products.rating,
                                    view = products.view,
                                    productOldPrice = products.productOldPrice,
                                    productCurrentPrice = products.productCurrentPrice,
                                    stockStatus = products.stockStatus,
                                    onClick = {},
                                )

                            }
                        }
                    }
                }
            }
        }
        item {
            NewsletterComp()
        }
    }
}