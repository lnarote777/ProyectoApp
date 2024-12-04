package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Separador(num : Int){
    Spacer(Modifier.width(num.dp))
}