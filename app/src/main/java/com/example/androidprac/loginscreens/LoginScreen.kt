package com.example.androidprac.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R

@Composable
fun Login() {

    var checked by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {
        Text(
            text = "Hey, Hello \uD83D\uDC4B\uD83C\uDFFB",
            fontFamily = FontFamily.SansSerif,
            fontSize = 28.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            lineHeight = 100.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Email *",
            fontFamily = FontFamily.SansSerif,
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Medium
        )
        OutlinedTextField(modifier = Modifier.fillMaxWidth(),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "john@example.com")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "EmailIcon")
            }

        )
        Spacer(modifier = Modifier.size(20.dp))
        Text(
            text = "Password *",
            fontFamily = FontFamily.SansSerif,
            fontSize = 14.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Medium
        )
        OutlinedTextField(modifier = Modifier.fillMaxWidth(),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(text = "********")
            },
            leadingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.baseline_key_24),
                    contentDescription = "Icon"
                )
            }

        )
        Spacer(modifier = Modifier.size(20.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = checked,
                onCheckedChange = { checked = it }
            )
            Text(text = "Remember Me")
        }
        Spacer(modifier = Modifier.size(300.dp))
        Button(
            onClick = { },
            Modifier.fillMaxWidth(),

            )
        {
            Row {
                Text(
                    text = "LOG IN ",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium
                )
                Image(
                    painter = painterResource(id = R.drawable.right),
                    contentDescription = "rightIcon",
                    modifier = Modifier.size(20.dp)
                )
            }

        }
        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)) {
            Text(text = "New here? Create an account.")
            TextButton(onClick = { }) {
                Text(text = "Sign Up")
            }
        }


    }
}