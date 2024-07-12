package com.example.androidprac.loginscreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.navigation.NavController
import com.example.androidprac.R
import com.example.androidprac.androidpractice.ButtonComp


object Variables {
    val xSm: Dp = 8.dp
    val Grey200: Color = Color(0xFFEEEEEE)
    val Grey900: Color = Color(0xFF212121)
    val textInactive: Color = Color(0x99000000)
    val primary500: Color = Color(0xFF6366F1)
    val textIconographyDarkActive: Color = Color(0xDEFFFFFF)
}

@Composable
fun WelcomePage(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            //.height(714.dp)
            .fillMaxSize()
            .padding(15.dp),
    ) {
        Text(
            text = "Hey, Hello 👋🏻 ",
            style = TextStyle(
                fontSize = 24.sp,
                lineHeight = 32.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight(700),
                color = Color(0x99000000),
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
        )
        Image(painter = painterResource(id = R.drawable.splash), contentDescription = "SplashPic")
        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .width(398.dp)
                .height(256.dp)
                .padding(
                    start = Variables.xSm,
                    top = Variables.xSm,
                    end = Variables.xSm,
                    bottom = Variables.xSm
                )

        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    Variables.xSm,
                    Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(
                        color = Variables.Grey200,
                        shape = RoundedCornerShape(size = 999.dp)
                    )
                    .padding(
                        start = 32.dp,
                        top = Variables.xSm,
                        end = 32.dp,
                        bottom = Variables.xSm
                    )
            ) {
                ButtonComp(
                    onClick = { },
                    text = "Continue With Google",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Variables.Grey900,
                    ), modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp),
                    colors = ButtonDefaults.buttonColors(Variables.Grey200),
                    IconStart = {
                        Image(
                            painter = painterResource(id = R.drawable.googlehd),
                            contentDescription = "GoogleIcon", Modifier.padding(2.dp)
                        )
                    }
                )

            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(
                    Variables.xSm,
                    Alignment.CenterHorizontally
                ),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(
                        color = Variables.Grey200,
                        shape = RoundedCornerShape(size = 999.dp)
                    )
                    .padding(
                        start = 32.dp,
                        top = Variables.xSm,
                        end = 32.dp,
                        bottom = Variables.xSm
                    )
            ) {
                ButtonComp(
                    onClick = { },
                    text = "Continue With Github",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(600),
                        color = Variables.Grey900,
                    ), modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp),
                    colors = ButtonDefaults.buttonColors(Variables.Grey200),
                    IconStart = {
                        Image(
                            painter = painterResource(id = R.drawable.githubhd),
                            contentDescription = "GithubIcon", Modifier.padding(3.dp)
                        )
                    }
                )
            }
            Text(
                text = "OR",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight(600),
                    color = Variables.textInactive,
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .width(23.dp)
                    .height(24.dp)
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(
                        color = Variables.primary500,
                        shape = RoundedCornerShape(size = 999.dp)
                    )
                    .padding(start = 20.dp, top = 12.dp, end = 20.dp, bottom = 12.dp)
            ) {
                ButtonComp(onClick = { navController.navigate(AppScreen.login)},
                    text = "Continue With Email",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        color = Variables.textIconographyDarkActive,
                        textAlign = TextAlign.Center,
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp),
                    colors = ButtonDefaults.buttonColors(Variables.primary500),
                    IconEnd = {
                        Image(
                            painter = painterResource(id = R.drawable.righthdicon),
                            contentDescription = "RightIcon", modifier = Modifier
                                .padding(1.dp)
                                .width(20.dp)
                                .height(20.dp)
                        )
                    }
                )
            }

        }
    }
}
