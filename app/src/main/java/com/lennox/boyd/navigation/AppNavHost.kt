package com.lennox.boyd.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lennox.boyd.model.DashboardStat
//import com.lennox.boyd.ui.theme.screens.Splash_Screen
import com.lennox.boyd.ui.theme.screens.home.Home_screen
import com.lennox.boyd.ui.theme.screens.login.Login_screen
//import com.lennox.boyd.ui.theme.screens.register.Login_screen
import com.lennox.boyd.ui.theme.screens.register.Register_screen
import com.lennox.boyd.ui.theme.screens.splash.Splash_screen
import com.lennox.boyd.ui.theme.screens.dashboard.Dashboard_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController:NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME) {
//    ROUTE_SPLASH
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            Home_screen(navController)


        }
        composable(ROUTE_LOGIN) {
            Login_screen(navController)
        }
        composable(ROUTE_REGISTER) {
            Register_screen(navController)

        }
        composable(ROUTE_SPLASH) {
            Splash_screen(navController)

        }
        composable(ROUTE_DASHBOARD) {
            Dashboard_screen()

        }


    }
}