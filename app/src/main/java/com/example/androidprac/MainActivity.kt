package com.example.androidprac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androidprac.androidpractice.ButtonComp
import com.example.androidprac.androidpractice.color
import com.example.androidprac.loginscreens.NavController
import com.example.androidprac.ui.theme.AndroidPracTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPracTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(Modifier.padding(innerPadding)) {
                        NavController()
                        //MyCustomInputField()
                        //MainScreen()
                    }
                }
            }
        }
    }
}
//
//@Composable
//fun MainScreen() {
//    Row(
//        modifier = Modifier.fillMaxSize(),
//        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
//        verticalAlignment = Alignment.CenterVertically
//    )
//    {
//        ButtonComp(
//            text = "New",
//            modifier = Modifier
//                .width(148.dp)
//                .height(48.dp),
//            onClick = { },
//            shape = RoundedCornerShape(16.dp),
//            enabled = true,
//            style = TextStyle(Color.White),
//            colors = ButtonDefaults.buttonColors(color.tertiary),
//            IconStart = {
//                Image(
//                    imageVector = Icons.Default.KeyboardArrowLeft,
//                    contentDescription = "backarrow"
//                )
//            },
//            IconEnd = {
//                Image(
//                    imageVector = Icons.Default.KeyboardArrowRight,
//                    contentDescription = "End Icon"
//                )
//            }
//        )
//    }
//}
