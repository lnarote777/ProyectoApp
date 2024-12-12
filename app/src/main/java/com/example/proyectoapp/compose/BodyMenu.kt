package com.example.proyectoapp.compose

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.proyectoapp.R
import com.example.proyectoapp.compose.componentes.Bubble


@Composable
fun BodyMenu(){
    Bubble(
        title = "Hiragana",
        image = painterResource(R.drawable.hiragana),
        description = "Hiragana"
    )

    Bubble(
        title = "Katakana",
        image = painterResource(R.drawable.katakana),
        description = "Katakana"
    )

    Bubble(
        title = "Basico 1",
        image = painterResource(R.drawable.basic),
        description = ""
    )

    Bubble(
        title = "Basico 2",
        image = painterResource(R.drawable.basic),
        description = ""
    )

    Bubble(
        title = "Familia",
        image = painterResource(R.drawable.family),
        description = ""
    )

    Bubble(
        title = "Animales",
        image = painterResource(R.drawable.animals),
        description = ""
    )

    Bubble(
        title = "Comida",
        image = painterResource(R.drawable.food),
        description = ""
    )

    Bubble(
        title = "Preguntas y Respuestas ",
        image = painterResource(R.drawable.qna),
        description = ""
    )

}
