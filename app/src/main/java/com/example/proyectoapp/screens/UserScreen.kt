package com.example.proyectoapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.proyectoapp.compose.BodyUser
import com.example.proyectoapp.compose.componentes.HeaderUser
import com.example.proyectoapp.navigation.AppScreen

@Composable
fun UserScreen(navController: NavController, user: String?){
    Column {
        HeaderUser(navController)
        BodyUser(user)
    }
}