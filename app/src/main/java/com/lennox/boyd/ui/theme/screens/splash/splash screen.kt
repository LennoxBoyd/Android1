package com.lennox.boyd.ui.theme.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.lennox.boyd.R
import com.lennox.boyd.navigation.ROUTE_HOME
import kotlinx.coroutines.delay

@Composable
fun Splash_screen(navController: NavHostController) {

    //show splash screen for 3 seconds
    LaunchedEffect(Unit) {
        delay(timeMillis = 2000)
        navController.navigate(ROUTE_HOME)//navigate to the home screen

    }
Box(
    contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()
){
    //splash screen content(logo or image)
    Image(
        painter = painterResource(id = R.drawable.l),
        contentDescription = "splashscreen logo",
        modifier = Modifier.fillMaxSize()

    )

}


}

@Preview(showBackground = true)
@Composable
private fun Splashscreenprev(){
    Splash_screen(rememberNavController())
}

