package com.example.androidprac.loginscreens

import kotlinx.serialization.Serializable

//sealed class AppScreen for navigation

sealed class AppScreen {

    @Serializable
    data object welcome : AppScreen()

    @Serializable
    data object login : AppScreen()

    @Serializable
    data object account : AppScreen()

    @Serializable
    data object home: AppScreen()

}
