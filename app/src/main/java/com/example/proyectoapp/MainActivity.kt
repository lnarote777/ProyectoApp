package com.example.proyectoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.proyectoapp.compose.BodyLogin
import com.example.proyectoapp.compose.LoginScreen
import com.example.proyectoapp.compose.componentes.Portada
import com.example.proyectoapp.ui.theme.ProyectoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    var showLoadingScreen by rememberSaveable { mutableStateOf(true) }

                    // Cambiar el estado después de 3 segundos
                    LaunchedEffect(Unit) {
                        kotlinx.coroutines.delay(3000)
                        showLoadingScreen = false
                    }

                    if (showLoadingScreen) {
                        Portada(modifier = Modifier.padding(innerPadding))
                    } else {
                        LoginScreen(modifier = Modifier.padding(innerPadding))
                    }
                }
            }
        }
    }
}
