package com.example.androidprac.core.models

import com.example.androidprac.presentataion.components.DynamicImageSource

data class ProductModel(
    val id: Int,
    val name: String,
    val image: DynamicImageSource
)