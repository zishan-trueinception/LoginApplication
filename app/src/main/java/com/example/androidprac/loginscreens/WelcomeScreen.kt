package com.example.androidprac.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R

@Composable
fun Welcome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp)
    ) {
        Text(
            text = "Hey, Hello \uD83D\uDC4B\uD83C\uDFFB",
            fontFamily = FontFamily.SansSerif,
            fontSize = 24.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            lineHeight = 100.sp,
            modifier = Modifier.padding(bottom = 0.dp)
        )
        Box(modifier = Modifier.size(420.dp))
        {
            Image(painter = painterResource(id = R.drawable.ssss),
                contentDescription = "", contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(150.dp)
                    .offset(x = 150.dp, y = 50.dp))
            Image(
                painter = painterResource(id = R.drawable.s),
                contentDescription = "splash1", modifier = Modifier
                    .size(250.dp)
                    .offset(x = 30.dp, y = 100.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ss),
                contentDescription = "splash2", modifier = Modifier
                    .size(160.dp)
                    .offset(x = 165.dp, y = 220.dp)
            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
                contentColor = Color.Black
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "githubIcon",
                    modifier = Modifier
                        .size(26.dp)
                        .padding(4.dp)
                )
                Text(
                    text = "Continue With Google",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium,
                )
            }

        }
        Spacer(modifier = Modifier.size(22.dp))
        Button(
            onClick = { },
            Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
                contentColor = Color.Black
            )
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "githubIcon",
                    modifier = Modifier
                        .size(26.dp)
                        .padding(4.dp)
                )
                Text(
                    text = "Continue With Github",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium
                )
            }

        }
        Spacer(modifier = Modifier.size(22.dp))
        Text(text = "OR", modifier = Modifier.padding(horizontal = 143.dp))
        Spacer(modifier = Modifier.size(22.dp))
        Button(
            onClick = { },
            Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "Continue With Email",
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.size(4.dp))
                Image(
                    painter = painterResource(id = R.drawable.right),
                    contentDescription = "RightIcon",
                    modifier = Modifier.size(22.dp)
                )

            }
        }


    }
}

