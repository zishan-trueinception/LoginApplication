package com.example.androidprac

import HomePage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.androidprac.ui.theme.AndroidPracTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPracTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Column(Modifier.padding(innerPadding)) {
//                        NavController()
//                        //MyCustomInputField()
//                        //MainScreen()
//                    }
//                }
                HomePage()
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
