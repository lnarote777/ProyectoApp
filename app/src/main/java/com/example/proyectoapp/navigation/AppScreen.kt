package com.example.proyectoapp.navigation

sealed class AppScreen (val route: String) {
    object RegisterScreen: AppScreen("RegisterScreen")
    object AcceptScreen: AppScreen("AcceptScreen")
}