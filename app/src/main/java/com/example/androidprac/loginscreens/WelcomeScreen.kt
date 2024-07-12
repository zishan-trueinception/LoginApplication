package com.example.androidprac.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidprac.R

@Composable
fun WelcomePage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
    ) {
        Text(
            text = "Hey, Hello \uD83D\uDC4B\uD83C\uDFFB",
            fontFamily = FontFamily.SansSerif,
            fontSize = 24.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold,
            color = Color.Gray,
            lineHeight = 100.sp,
        )
        Box(modifier = Modifier.fillMaxWidth())
        {
            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription = "GrpSplash"
            )
        }
        Spacer(modifier = Modifier.size(80.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Button(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .size(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer,
                    contentColor = Color.Black
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.googlehd),
                        contentDescription = "GoogleIcon",
                        modifier = Modifier
                            .size(30.dp)
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
                Modifier
                    .fillMaxWidth()
                    .size(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer,
                    contentColor = Color.Black
                )
            )
            {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.githubhd),
                        contentDescription = "githubIcon",
                        modifier = Modifier
                            .size(28.dp)
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
            Text(text = "OR", modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.size(22.dp))
            Button(
                onClick = { navController.navigate(AppScreen.login) },
                Modifier
                    .fillMaxWidth()
                    .size(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF6366F1),
                    contentColor = Color.White
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Continue With Email",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight(400)
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Image(
                        painter = painterResource(id = R.drawable.righthdicon),
                        contentDescription = "RightIcon",
                        modifier = Modifier.size(22.dp)
                    )
                }
            }
        }
    }
}

