package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.proyectoapp.R
import com.example.proyectoapp.navigation.AppScreen

@Composable
fun HeaderUser(navController: NavController){
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(top = 30.dp)
            .background(color = colorResource(R.color.portada))
    ){
        Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Atrás",
            tint = Color.White,
            modifier = Modifier
                .size(25.dp)
                .clickable { navController.navigate(route = AppScreen.MenuScreen.route) }
        )
    }
}