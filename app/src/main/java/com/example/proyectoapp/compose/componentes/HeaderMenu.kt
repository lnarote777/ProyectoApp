package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.proyectoapp.R
import com.example.proyectoapp.navigation.AppScreen


@Composable
fun HeaderMenu(navController: NavController, user: String?){
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = colorResource(R.color.portada))
    ){

        Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Atrás",
            tint = Color.White,
            modifier = Modifier
                .size(50.dp)
                .clickable { navController.navigate(route = AppScreen.LoginScreen.route) }
        )

        Spacer(Modifier.width(10.dp))

        Text(
            "Vamos a estudiar",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White

        )

        Row {
            Icon(imageVector = Icons.Default.AccountCircle,
                contentDescription = "Usuario")
            user ?.let { Text(user) }
        }
    }
}