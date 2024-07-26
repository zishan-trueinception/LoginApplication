package com.example.androidprac.presentataion.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprac.R


object Variables {
    val xSm: Dp = 8.dp
    val sm: Dp = 0.dp
    val Grid: Dp = 369.dp
    val textInactive: Color = Color(0x99000000)
}

@Composable
fun NewsletterComp(
    newsName: String = "Subscribe To Our Newsletter",
    bio: String = "By subscribing to our newsletter you are consenting us to send regular promotional mails for latest offers and products",
    imageResId: Int = R.drawable.papericon,
    outlineTextFieldName: String = "Full Name ",
    emailTextFieldName: String = "Email",
) {
    val nameText = remember {
        mutableStateOf("")
    }
    val emailText = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            // .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            //.height(631.dp)
            .padding(start = 16.dp, top = 24.dp, end = 16.dp, bottom = 24.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier
                .width(317.dp)
                .height(28.dp),
            horizontalArrangement = Arrangement.spacedBy(
                Variables.sm,
                Alignment.CenterHorizontally
            ),
            verticalAlignment = Alignment.Top,
        ) {
            Text(
                text = newsName,
                style = TextStyle(
                    fontSize = 20.sp,
                    lineHeight = 28.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF6366F1),
                ), modifier = Modifier
                    .width(277.dp)
                    .height(28.dp)
            )
            Image(
                modifier = Modifier
                    .padding(0.58333.dp)
                    .size(28.dp),
                painter = painterResource(id = imageResId),
                contentDescription = "image description"
            )
        }
        Text(
            text = bio,
            style = TextStyle(
                fontSize = 16.sp,
                lineHeight = 24.sp,
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight(400),
                color = Variables.textInactive,
                textAlign = TextAlign.Center,
            ),
            modifier = Modifier
                //.width(Variables.Grid)
                .fillMaxWidth()
                .height(72.dp)
        )
        Image(
            modifier = Modifier
                //.width(288.dp)
                .fillMaxWidth()
                .height(187.dp),
            painter = painterResource(id = R.drawable.newletter),
            contentDescription = "newsLetterImage"
        )
        Column(
            modifier = Modifier
                .width(342.dp),
            //.height(68.dp),
            verticalArrangement = Arrangement.spacedBy(Variables.xSm, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                verticalAlignment = Alignment.Top,
            ) {
                // Text for Full Name
                Text(
                    text = outlineTextFieldName,
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Color.Black,
                    ),
                    modifier = Modifier
                        //.width(66.dp)
                        .height(20.dp)
                )
                // Text for *
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
            // Text Field for Full Name
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(size = 999.dp)),
                value = nameText.value,
                onValueChange = {nameText.value = it},
                placeholder = {
                    Text(text = "john Doe")
                },
                leadingIcon = {
                    // Account Icon
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "AccountIcon"
                    )
                }
            )
            Spacer(modifier = Modifier.size(10.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp, Alignment.Start),
                verticalAlignment = Alignment.Top,
            ) {
                // Text for Full Name
                Text(
                    text = "E-mail Address",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Color.Black,
                    ),
                    modifier = Modifier
                        //.width(66.dp)
                        .height(20.dp)
                )
                // Text for *
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
            // Text Field for Full Name
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White, shape = RoundedCornerShape(size = 999.dp)),
                value = emailText.value,
                onValueChange = {emailText.value = it},
                placeholder = {
                    Text(text = "john Doe")
                },
                leadingIcon = {
                    // Account Icon
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "AccountIcon"
                    )
                }
            )
            Spacer(modifier = Modifier.size(10.dp))
            ButtonComp(
                onClick = { },
                text = "SUBMIT",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(400),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                ), modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                shape = RoundedCornerShape(size = 999.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFF6366F1))
            )
        }

    }
}