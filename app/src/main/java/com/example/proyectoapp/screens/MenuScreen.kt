package com.example.proyectoapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import com.example.proyectoapp.R
import com.example.proyectoapp.compose.BodyMenu
import com.example.proyectoapp.compose.componentes.HeaderMenu

@Composable
fun MenuScreen(navController: NavController, user: String?){
    Column(Modifier
        .fillMaxSize()
        .background(color = colorResource(R.color.portada2))
    ) {
        HeaderMenu(navController, user)
        BodyMenu()
    }
}
