package com.example.proyectoapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapp.R
import com.example.proyectoapp.navigation.AppScreen

@Composable
fun PortadaScreen(navController: NavController){
    var showLoadingScreen by rememberSaveable { mutableStateOf(false) }

    // Cambia el estado después de 3 segundos
    LaunchedEffect(Unit) {
        kotlinx.coroutines.delay(5000)
        navController.navigate(route = AppScreen.LoginScreen.route)
    }

    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.portada3))
    ) {
        Image(
            painter = painterResource(R.drawable.icon),
            contentDescription = "Icono app"
        )

        if (showLoadingScreen){
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 30.dp),
                color = Color.Red,
                trackColor = Color.White
            )
        } else {
            Button(
                onClick = {showLoadingScreen = true},
                colors = ButtonColors(
                    containerColor = colorResource(R.color.boton),
                    contentColor = Color.White,
                    disabledContentColor = Color.White,
                    disabledContainerColor = Color.DarkGray
                )
            ) { Text("¡Empezar a estudiar!") }
        }


    }
}