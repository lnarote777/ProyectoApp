package com.example.proyectoapp.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.twotone.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoapp.R

@Composable
fun BodyUser(user: String?){
    Column(modifier = Modifier.fillMaxWidth()) {
        Icon(
            imageVector = Icons.TwoTone.AccountCircle,
            contentDescription = "User",
            tint = colorResource(R.color.portada),
            modifier = Modifier
                .size(150.dp)
                .align(Alignment.CenterHorizontally)
        )

        user ?.let { Text(
            user,
            fontSize = 30.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) }

        Column() {
            Row(verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(20.dp)) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Configuración"
                )

                Spacer(Modifier.width(10.dp))
                Text("Configuración")
            }

            Row(verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 20.dp)) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "About us"
                )

                Spacer(Modifier.width(10.dp))
                Text("About us")
            }


            Text("Cerrar sesión",
                color = Color.Red,
                modifier = Modifier.padding(20.dp)
            )


            Text("Eliminar cuenta",
                color = Color.Red,
                modifier = Modifier.padding(horizontal = 20.dp)
            )



        }

    }
}


@Preview
@Composable
fun Preview(){
    BodyUser("Juan")
}