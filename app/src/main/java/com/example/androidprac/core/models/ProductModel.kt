package com.example.androidprac.core.models

import com.example.androidprac.presentataion.components.DynamicImageSource

// data class for top products
data class ProductModel(
    val label: String,
    val productName: String,
    val image: DynamicImageSource,
    val deliveryType: String,
    val productCurrentPrice: String,
    val productOldPrice: String? = null,
    val rating: String,
    val stockStatus: String? = null,
    val view: String,
)