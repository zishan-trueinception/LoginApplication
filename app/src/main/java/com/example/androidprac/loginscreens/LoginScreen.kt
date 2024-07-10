package com.example.androidprac.loginscreens


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androidprac.R
import com.example.androidprac.androidpractice.ButtonComp
import com.example.androidprac.androidpractice.color

@Composable
fun LoginPage(navController: NavController) {
    var checked by remember { mutableStateOf(true) }
    Column(
        Modifier
            .width(398.dp)
            .height(714.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(398.dp)
                .height(714.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .width(398.dp)
                    .height(280.dp)
            ) {
                Text(
                    text = "Hey, Hello 👋🏻 ",
                    style = TextStyle(
                        fontSize = 24.sp,
                        lineHeight = 32.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(700),
                        color = Color.Gray,
                    ),
                    modifier = Modifier
                        .width(398.dp)
                        .height(32.dp)
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .width(398.dp)
                        .height(68.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                    ) {
                        Text(
                            text = "Email ",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Black,
                            ),
                            modifier = Modifier
                                .width(38.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "*",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Red
                            )
                        )
                    }
                    OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(text = "john@example.com")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "EmailIcon"
                            )
                        }
                    )
                }
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .width(398.dp)
                        .height(68.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                        verticalAlignment = Alignment.Top,
                    ) {
                        Text(
                            text = "Password ",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Black
                            ),
                            modifier = Modifier
                                .width(66.dp)
                                .height(20.dp)
                        )
                        Text(
                            text = "*",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily.SansSerif,
                                fontWeight = FontWeight(600),
                                color = Color.Red
                            )
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(
                            12.dp,
                            Alignment.CenterHorizontally
                        ),
                        verticalAlignment = Alignment.CenterVertically,
                    )
                    {
                        OutlinedTextField(modifier = Modifier.fillMaxWidth(),
                            value = "",
                            onValueChange = {},
                            placeholder = {
                                Text(text = "********")
                            },
                            leadingIcon = {
                                Image(
                                    painter = painterResource(id = R.drawable.baseline_key_24),
                                    contentDescription = "PassIcon",
                                    contentScale = ContentScale.None,
                                )
                            }
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { checked = it }
                    )
                    Text(text = "Remember Me")
                }
            }

            Column(
                Modifier
                    .width(398.dp)
                    .height(104.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                ButtonComp(
                    onClick = { },
                    text = "LOG IN",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontWeight = FontWeight(400),
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .width(398.dp)
                        .height(48.dp)
                        .background(
                            color = Color(0xFF6366F1),
                            shape = RoundedCornerShape(size = 999.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(Color(0xFF6366F1)),
                    IconEnd = {
                        Icon(
                            painter = painterResource(id = R.drawable.right),
                            contentDescription = "rightIcon",
                            modifier = Modifier
                                .padding(1.dp)
                                .width(20.dp)
                                .height(20.dp)
                        )
                    }
                )
                Row(
                    Modifier
                        .width(291.dp)
                        .height(24.dp),
                    horizontalArrangement = Arrangement.spacedBy(0.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {

                    Text(text = "New here? Create an account.")
                    Text(
                        text = "Sign up",
                        textAlign = TextAlign.Center,
                        color = Color.Blue,
                       modifier = Modifier
                            .width(66.dp)
                            .height(24.dp)
                            .clickable { navController.navigate(AppScreen.account)},
                    )
                }
            }

        }
    }
}



