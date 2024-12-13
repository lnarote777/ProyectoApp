package com.example.proyectoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.proyectoapp.screens.LoginScreen
import com.example.proyectoapp.screens.MenuScreen
import com.example.proyectoapp.screens.PortadaScreen
import com.example.proyectoapp.viewModel.LoginViewModel

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.PortadaScreen.route){
        composable(AppScreen.PortadaScreen.route){
            PortadaScreen(navController)
        }

        composable(AppScreen.LoginScreen.route){
            val viewModel = LoginViewModel()
            LoginScreen(navController, viewModel)
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
