package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyectoapp.R

@Preview
@Composable
fun Portada(modifier: Modifier = Modifier){
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

        LinearProgressIndicator(
            modifier = Modifier.padding(top = 30.dp),
            color = Color.Red,
            trackColor = Color.White
        )

    }
}