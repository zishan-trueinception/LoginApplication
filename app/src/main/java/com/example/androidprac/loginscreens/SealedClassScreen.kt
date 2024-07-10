package com.example.androidprac.loginscreens

import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

sealed class AppScreen{

    @Serializable
    object welcome:AppScreen()

    @Serializable
    object login:AppScreen()

    @Serializable
    object account:AppScreen()
}
