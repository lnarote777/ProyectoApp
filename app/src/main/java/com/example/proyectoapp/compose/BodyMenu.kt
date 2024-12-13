package com.example.proyectoapp.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectoapp.R
import com.example.proyectoapp.compose.componentes.Bubble


@Composable
fun BodyMenu(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Bubble(
                title = "Hiragana",
                image = painterResource(R.drawable.hiragana),
                description = "Hiragana"
            )
            Spacer(Modifier.width(20.dp))
            Bubble(
                title = "Katakana",
                image = painterResource(R.drawable.katakana),
                description = "Katakana"
            )
        }
        Spacer(Modifier.height(50.dp))
        Bubble(
            title = "Basico 1",
            image = painterResource(R.drawable.basic),
            description = ""
        )
        Spacer(Modifier.height(50.dp))
        Bubble(
            title = "Basico 2",
            image = painterResource(R.drawable.basic),
            description = ""
        )
        Spacer(Modifier.height(50.dp))
        Row {
            Bubble(
                title = "Familia",
                image = painterResource(R.drawable.family),
                description = ""
            )
            Spacer(Modifier.width(20.dp))
            Bubble(
                title = "Animales",
                image = painterResource(R.drawable.animals),
                description = ""
            )
            Spacer(Modifier.width(20.dp))
            Bubble(
                title = "Comida",
                image = painterResource(R.drawable.food),
                description = ""
            )
        }
        Spacer(Modifier.height(50.dp))
        Bubble(
            title = "Preguntas y Respuestas ",
            image = painterResource(R.drawable.qna),
            description = ""
        )
    }

}
