package com.example.androidprac.loginscreens

import kotlinx.serialization.Serializable

//sealed class AppScreen for navigation

sealed class AppScreen {

    @Serializable
    data object Welcome : AppScreen()

    @Serializable
    data object Login : AppScreen()

    @Serializable
    data object Account : AppScreen()

    @Serializable
    data object Home : AppScreen()

}
