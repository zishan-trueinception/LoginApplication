package com.example.androidprac.loginscreens

import AccountPage
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.welcome) {
        composable<AppScreen.welcome> { WelcomePage(navController) }
        composable<AppScreen.login> { LoginPage(navController) }
        composable<AppScreen.account> { AccountPage(navController) }
    }
}