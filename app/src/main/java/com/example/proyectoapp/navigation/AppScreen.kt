package com.example.proyectoapp.navigation

sealed class AppScreen (val route: String) {
    object LoginScreen: AppScreen("LoginScreen")
    object MenuScreen: AppScreen("MenuScreen")
}