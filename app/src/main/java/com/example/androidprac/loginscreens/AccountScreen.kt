import android.accounts.Account
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.androidprac.loginscreens.AppScreen

@Composable
fun AccountPage(navController: NavController) {

    Column(
        Modifier
            .width(398.dp)
            .height(714.dp), verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Column(
            Modifier
                .width(398.dp)
                .height(332.dp),
            verticalArrangement = Arrangement.spacedBy(32.dp, Alignment.Top),
            horizontalAlignment = Alignment.Start,
        ) {
            Text(

                text = "Create Account",
                Modifier
                    .width(398.dp)
                    .height(32.dp),
                style = TextStyle(
                    fontSize = 24.sp,
                    lineHeight = 32.sp,
                    fontWeight = FontWeight(700),
                    color = Color.Gray,
                )
            )
            Column(
                Modifier
                    .width(398.dp)
                    .height(68.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {

                    Text(
                        text = "Full Name ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
                    )
                    Text(text = "*", color = Color.Red)
                }
                OutlinedTextField(modifier = Modifier
                    .width(398.dp)
                    .height(40.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 6.dp)
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "john Doe")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "CircleAccountIcon"
                        )
                    }

                )
            }

            Column(
                Modifier
                    .width(398.dp)
                    .height(68.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {
                    Text(
                        text = "Email ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
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
                OutlinedTextField(modifier = Modifier
                    .width(398.dp)
                    .height(40.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 6.dp)
                    ),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "john@example.com")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "EmailIcon")
                    }
                )
            }
            Column(
                Modifier
                    .width(398.dp)
                    .height(68.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {

                Row {

                    Text(
                        text = "Password ",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Normal,
                        fontWeight = FontWeight.Medium
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
                OutlinedTextField(modifier = Modifier
                    .width(398.dp)
                    .height(40.dp), value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(text = "********")
                    },
                    leadingIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.baseline_key_24),
                            contentDescription = "PasswordIcon"
                        )
                    }

                )
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
                text = "SIGN UP",
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
                Text(
                    text = "New here? Create an account.",
                    style = TextStyle(
                        fontSize = 14.sp,
                        lineHeight = 16.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight(400),
                        color = Color(0xDE000000),
                        textAlign = TextAlign.Center,
                    )
                )
                Text(
                    color = Color.Blue,
                    text = "Log in",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .width(66.dp)
                        .height(24.dp)
                        .clickable { navController.navigate(AppScreen.login)},
                )
            }
        }
    }
}