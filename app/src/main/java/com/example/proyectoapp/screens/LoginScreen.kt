package com.example.proyectoapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapp.R
import com.example.proyectoapp.compose.BodyLogin
import com.example.proyectoapp.viewModel.ILoginViewModel

@Composable
fun LoginScreen(navController: NavController, viewModel: ILoginViewModel){
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.fondologin),
            contentDescription = "fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.padding(top = 30.dp, bottom = 18.dp)
                .fillMaxSize()
                .imePadding()
        )

        BodyLogin(navController, viewModel)

    }
}