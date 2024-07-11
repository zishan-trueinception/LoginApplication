package com.example.androidprac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androidprac.androidpractice.CustomInputField
import com.example.androidprac.ui.theme.AndroidPracTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidPracTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(Modifier.padding(innerPadding)) {
                        //NavController()
                        CustomInputField(value = "",
                            onValueChange = {},
                            modifier = Modifier.padding(16.dp),
                            shape = RoundedCornerShape(16.dp),
                            placeholder = { Text(text = "Enter Your Name") },
                            keyboardActions = KeyboardActions.Default,
                            leadingIcon = {
                                Image(
                                    imageVector = Icons.Default.AccountCircle,
                                    contentDescription = ""
                                )
                            }
                        )
                    }
                }
            }
        }
    }
}
