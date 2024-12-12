package com.example.proyectoapp.compose.componentes


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.example.proyectoapp.viewModel.ILoginViewModel
import androidx.compose.material3.Button
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Mensaje(show: Boolean, onDismiss: () -> Unit, info: String){
    if (show){
        AlertDialog(
            onDismissRequest ={onDismiss()} ,
            title ={ Text("Error de credenciales") } ,
            text ={
                Text(info)

            } ,
            dismissButton = {},
            confirmButton ={Button(onDismiss) { Text("Aceptar") }}
        )

    }

}