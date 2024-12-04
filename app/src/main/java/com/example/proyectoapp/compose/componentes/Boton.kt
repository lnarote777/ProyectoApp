package com.example.proyectoapp.compose.componentes

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Boton(text: String, modifier : Modifier = Modifier, color: ButtonColors, onclick: () -> Unit){
    Button(
        onClick = onclick,
        modifier = modifier,
        colors = color
    ) {
        Text(text = text)
    }
}