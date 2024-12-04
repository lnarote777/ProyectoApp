package com.example.proyectoapp.compose.componentes

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoapp.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Email(email: String, valueEmail: (String) -> Unit){

    OutlinedTextField(value = email,
        onValueChange = valueEmail,
        modifier = Modifier
            .padding(horizontal = 5.dp)
            .fillMaxWidth()
            .height(60.dp),
        textStyle = TextStyle(fontSize = 16.sp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.LightGray,
            cursorColor = Color.Blue
        ),
        label = { Text("Email") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Contrasena(pass: String, valuePass: (String) -> Unit, passVisible: Boolean, onclick: () -> Unit){
    OutlinedTextField(
        value = pass,
        onValueChange = valuePass,
        modifier = Modifier
            .padding(horizontal = 5.dp)
            .fillMaxWidth()
            .height(60.dp),
        visualTransformation = if (passVisible) VisualTransformation.None else PasswordVisualTransformation(),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.LightGray,
            cursorColor = Color.Blue
        ),
        singleLine = true,
        trailingIcon ={
            val image = if (passVisible) painterResource(R.drawable.visibilityoff) else painterResource(
                R.drawable.visibility)
            val description = if (passVisible) "Ocultar contraseña" else "Mostrar contraseña"
            IconButton(onClick = onclick) {
                Icon(
                    painter = image,
                    contentDescription = description,
                    tint = Color.Black,
                    modifier = Modifier.size(20.dp)
                )
            }
        },
        label = { Text("Contraseña") }
    )
}