package com.example.proyectoapp.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.proyectoapp.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Box(contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.fondologin),
            contentDescription = "fondo",
            contentScale = ContentScale.Crop,
            modifier = modifier
                .fillMaxSize()
                .imePadding()
        )

        BodyLogin()

    }
}