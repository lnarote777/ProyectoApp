package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Bubble(title: String, image: Painter, description: String){
    Card (
        modifier = Modifier
            .size(100.dp)
            .clickable {}
        ,
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ){
        Image(
            painter = image,
            contentDescription = description,
            Modifier
                .size(60.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        )
        Spacer(Modifier.height(10.dp))
        Text(
            title,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}