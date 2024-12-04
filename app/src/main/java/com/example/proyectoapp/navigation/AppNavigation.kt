package com.example.proyectoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreen.RegisterScreen.route){
        composable(AppScreen.RegisterScreen.route){

        }

        composable(
            AppScreen.AcceptScreen.route+ "/{text}",
            arguments = listOf(navArgument(name = "text"){
                type = NavType.StringType
            })
        ){

        }
    }
}
