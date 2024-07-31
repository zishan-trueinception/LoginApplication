package com.example.androidprac.core.data.repositories.topProducts

import com.example.androidprac.R
import com.example.androidprac.core.models.ProductModel
import com.example.androidprac.presentataion.components.DynamicImageSource

class TopProductRepoImpl : TopProductRepo {
    override fun getAllTopProducts(): List<ProductModel> {
        return listOf(
            ProductModel(
                label = "Development Boards",
                image = DynamicImageSource.Local(R.drawable.image_arduino),
                productName = "Arduino Nano RP2040",
                deliveryType = "free delivery",
                productCurrentPrice = "",
                productOldPrice = null,
                stockStatus = "available soon",
                rating = "4.5",
                view = "1563 views"
            ),
            ProductModel(
                label = "Raspberry Pi",
                image = DynamicImageSource.Local(R.drawable.image_raspberry_pi),
                productName = "Raspberry PI 4 Model B With 4GB RAM",
                deliveryType = "free delivery",
                productCurrentPrice = "₹ 5,999.00",
                productOldPrice = null,
                stockStatus = null,
                rating = "4.8",
                view = "1563 views"
            )
        )
    }
}