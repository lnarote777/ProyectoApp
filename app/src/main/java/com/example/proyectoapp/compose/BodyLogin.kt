package com.example.proyectoapp.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material.icons.twotone.AccountCircle
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectoapp.R
import com.example.proyectoapp.compose.componentes.Boton
import com.example.proyectoapp.compose.componentes.Check
import com.example.proyectoapp.compose.componentes.Contrasena
import com.example.proyectoapp.compose.componentes.Email


@Composable
fun BodyLogin(){
    var email by rememberSaveable { mutableStateOf("") }
    var passw by rememberSaveable { mutableStateOf("") }
    var passVisible by rememberSaveable { mutableStateOf(false) }
    var isChecked by rememberSaveable { mutableStateOf(false) }


    Box(
        modifier = Modifier
        .background(color = Color.White, shape = RoundedCornerShape(20.dp))
        .height(500.dp)
        .width(350.dp)
    ){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Bienvenido/a",
                fontSize = 30.sp,
                modifier = Modifier.padding(10.dp)
            )

            Icon(
                imageVector = Icons.TwoTone.AccountCircle,
                contentDescription = "User",
                tint = colorResource(R.color.portada),
                modifier = Modifier.size(150.dp)
            )
            Spacer(Modifier.height(20.dp))

            Email(email) { email = it}

            Spacer(Modifier.height(10.dp))

            Contrasena(pass = passw,
                passVisible = passVisible,
                onclick = {passVisible = !passVisible},
                valuePass = {passw = it}
            )

            Row(horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Check(
                    text = "Remember me",
                    checked = isChecked,
                    onCheckedChange = {isChecked = !isChecked}
                )

                Text(text = "Forgot password?",
                    color = Color.DarkGray,
                    fontSize = 15.sp,
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth().padding(10.dp)
                )
            }



            Spacer(Modifier.height(40.dp))

            Boton(text = "Iniciar sesión",
                modifier = Modifier,
                color = ButtonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White,
                    disabledContainerColor = Color.Yellow,
                    disabledContentColor = Color.Black
                ),
                onclick = {}
            )
        }

    }
}

@Preview
@Composable
fun BodyPreview(){
    LoginScreen()
}