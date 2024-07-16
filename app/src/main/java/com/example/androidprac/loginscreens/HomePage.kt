package com.example.androidprac.loginscreens

import HomePage
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidprac.R

//data class BottomNavItem(
//    val title: String,
//    val selectedIcon: ImageVector,
//    val unselectedIcon: ImageVector,
//)
//val items = listOf(
//    BottomNavItem(
//        title = "Home",
//        selectedIcon = Icons.Default.Home,
//        unselectedIcon = Icons.Default.Home
//    ),
//    BottomNavItem(
//        title = "Profile",
//        selectedIcon = Icons.Default.Person,
//        unselectedIcon = Icons.Default.Person
//    ),
//    BottomNavItem(
//        title = "Settings",
//        selectedIcon = Icons.Default.Settings,
//        unselectedIcon = Icons.Default.Settings
//    )
//)

@Composable
fun HomeScreen(navController: NavController) {
    val selected = remember {
        mutableStateOf(false)
    }
    Scaffold(
        bottomBar = {
            NavigationBar(
                containerColor = Color.White
            ) {
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = "HomeIcon", modifier = Modifier
                            .padding(1.dp)
                            .width(28.dp)
                            .height(28.dp)
                    )
                }, label = { Text(text = "Home") })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.offer),
                        contentDescription = "offerIcon", modifier = Modifier
                            .padding(1.dp)
                            .width(28.dp)
                            .height(28.dp)
                    )
                }, label = { Text(text = "Offers") })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.categoryy),
                        contentDescription = "CategoryIcon", modifier = Modifier
                            .padding(1.dp)
                            .width(28.dp)
                            .height(28.dp)
                    )
                }, label = { Text(text = "Category") })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.phonecall),
                        contentDescription = "CallIcon", modifier = Modifier
                            .padding(1.dp)
                            .width(28.dp)
                            .height(28.dp)
                    )
                }, label = { Text(text = "Call") })
                NavigationBarItem(selected = false, onClick = { }, icon = {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = "ProfileIcon", modifier = Modifier
                            .padding(1.dp)
                            .width(28.dp)
                            .height(28.dp)
                    )
                }, label = { Text(text = "My Profile") })
            }
        }
    ) { innerPadding ->
        Column(Modifier.padding(innerPadding)) {
            HomePage()
        }
    }
}