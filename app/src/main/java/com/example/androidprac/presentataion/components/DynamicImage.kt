package com.example.androidprac.presentataion.components

import androidx.compose.ui.text.Placeholder
import com.example.androidprac.R

sealed class DynamicImageSource{
    data class Url(
        val url:String?,
    ):DynamicImageSource()
}