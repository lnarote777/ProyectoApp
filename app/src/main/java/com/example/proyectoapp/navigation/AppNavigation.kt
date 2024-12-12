package com.example.proyectoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectoapp.screens.LoginScreen
import com.example.proyectoapp.screens.MenuScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.LoginScreen.route){
        composable(AppScreen.LoginScreen.route){
            LoginScreen(navController)
        }

        composable(
            AppScreen.MenuScreen.route+ "/{user}",
            arguments = listOf(navArgument(name = "user"){
                type = NavType.StringType
            })
        ){
            MenuScreen(navController, it.arguments?.getString("user"))
        }
    }
}
