package com.example.androidprac.loginscreens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
// NavHost is used to navigate between different screens
fun NavController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.Welcome) {
        composable<AppScreen.Welcome> { WelcomePage(navController) }
        composable<AppScreen.Login> { LoginScreen(navController) }
        composable<AppScreen.Account> { AccountScreen(navController) }
        composable<AppScreen.Home> { HomePage(navController) }
    }
}