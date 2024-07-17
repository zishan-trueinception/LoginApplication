package com.example.androidprac.loginscreens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
// NavHost is used to navigate between different screens
fun NavController() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.welcome) {
        composable<AppScreen.welcome> { WelcomePage(navController) }
        composable<AppScreen.login> { LoginScreen(navController) }
        composable<AppScreen.account> { AccountScreen(navController) }
        composable<AppScreen.home> { HomePage(navController) }
    }
}