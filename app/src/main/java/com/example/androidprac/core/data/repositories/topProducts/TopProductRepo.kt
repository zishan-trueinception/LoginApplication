package com.example.androidprac.core.data.repositories.topProducts

import com.example.androidprac.core.models.ProductModel

interface TopProductRepo  {
    fun getAllTopProducts(): List<ProductModel>
}