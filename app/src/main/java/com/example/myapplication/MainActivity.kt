package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Columnas()
        }
    }
}

@Preview(showBackground = false)
@Composable
fun Columnas() {
    Column (modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(align = Alignment.Center)
        .padding(5.dp)
        .verticalScroll(rememberScrollState())) {
        Texto(texto = "Jean")
        Espacio()
        Texto(texto = "Cabañas")
        Texto(texto = "Quintana")
        Texto(texto = "Dejesús")
        Texto(texto = "León")
        Espacio()
        Texto(texto = "Iturbe")
        Texto(texto = "Piris Da Motta")
        Texto(texto = "Viera")
        Texto(texto = "Domínguez")
        Espacio()
        Texto(texto = "Da Costa")
        Texto(texto = "Fernández")
    }
}

@Preview(showBackground = false)
@Composable
fun Filas() {
    Row {
        Texto(texto = "Jean")
        Texto(texto = "Cabañas")
    }
}

@Composable
fun Texto(texto: String) {
    Text(
        text = texto,
        color = Color.White,
        fontFamily = FontFamily.SansSerif,
        fontSize = 50.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF1C2833))
            .padding(5.dp)
    )
}

@Composable
fun Espacio() {
    Spacer(modifier = Modifier.height(5.dp))
}