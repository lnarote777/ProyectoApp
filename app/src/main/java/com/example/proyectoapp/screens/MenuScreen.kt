package com.example.proyectoapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.proyectoapp.compose.BodyMenu
import com.example.proyectoapp.compose.componentes.HeaderMenu

@Composable
fun MenuScreen(navController: NavController, user: String?){
    Column(Modifier.fillMaxSize()) {
        HeaderMenu(navController, user)
        BodyMenu()
    }
}
