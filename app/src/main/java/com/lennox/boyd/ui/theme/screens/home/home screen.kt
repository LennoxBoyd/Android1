package com.lennox.boyd.ui.theme.screens.home

//import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lennox.boyd.navigation.ROUTE_DASHBOARD
import com.lennox.boyd.navigation.ROUTE_LOGIN
import com.lennox.boyd.navigation.ROUTE_REGISTER

@Composable
fun Home_screen(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            "Lennox",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif
        )

        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier.width(300.dp)
                               .padding(16.dp),
        ) {
            Text(
                "login",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.clickable { }
            )

        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(
            onClick = { navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier.width(300.dp)
                               .padding(16.dp),
        ) {
            Text(
                "Register",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier.clickable { }
            )

        }
        Spacer(modifier = Modifier.width(300.dp))
        Text(
            "Don't have an account!!" +
                    "Click here to register",
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.clickable { navController.navigate(ROUTE_REGISTER)}
                               .padding(16.dp)
        )
        Spacer(modifier = Modifier.width(300.dp))
        Text(
            "Dashboard",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.clickable{ navController.navigate(ROUTE_DASHBOARD)}
                               .padding(16.dp)
        )




    }
}







@Preview(showBackground =true )
@Composable
private fun Homepre() {
    Home_screen(rememberNavController())

}
