package com.example.proyectoapp.navigation

sealed class AppScreen (val route: String) {
    object PortadaScreen: AppScreen("PortadaScreen")
    object LoginScreen: AppScreen("LoginScreen")
    object MenuScreen: AppScreen("MenuScreen")
}