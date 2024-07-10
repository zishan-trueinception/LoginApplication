package com.example.androidprac.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidprac.R
@Composable
fun WelcomePage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 5.dp)
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
            Image(painter = painterResource(id = R.drawable.breadbordpic),
                contentDescription = "", contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(170.dp)
                    .height(150.dp)
                    .offset(x = 215.dp, y = 40.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.splashhd),
                contentDescription = "splash1", modifier = Modifier
                    .width(322.71121.dp)
                    .height(215.00276.dp)
                    .offset(x = 0.dp, y = 100.dp)

            )
            Image(
                painter = painterResource(id = R.drawable.ss),
                contentDescription = "splash2", modifier = Modifier
                    .width(243.5294.dp)
                    .height(161.84875.dp)
                    .offset(x = 105.dp, y = 185.dp)
                    .drawWithContent {
                        drawContent()
                        drawRect(
                            color = Color.Gray,
                            topLeft = Offset(50f, size.height),
                            size = Size(size.width, 0.dp.toPx())
                        )
                    }

            )
        }
        Spacer(modifier = Modifier.size(20.dp))
        Column(
                verticalArrangement = Arrangement.spacedBy(0.dp,Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(398.dp)
                .height(256.dp)
                .padding(start = 8.dp)
        ) {
            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
                    .size(55.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.surfaceContainer,
                    contentColor = Color.Black
                )
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "GoogleIcon",
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
                Modifier.fillMaxWidth()
                    .size(55.dp),
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
            Text(text = "OR", modifier = Modifier.align(Alignment.CenterHorizontally))
            Spacer(modifier = Modifier.size(22.dp))
            Button(
                onClick = { navController.navigate(AppScreen.login)},
                Modifier.fillMaxWidth()
                    .size(55.dp)
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
}

