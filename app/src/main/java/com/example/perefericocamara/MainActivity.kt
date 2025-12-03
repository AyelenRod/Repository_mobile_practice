package com.example.perefericocamara

import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Definicion de UI
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CameraScreen()
                }
            }
        }
    }
}

@Composable
fun CameraScreen() {
    val context = LocalContext.current

    var imageBitmap by remember { mutableStateOf<Bitmap?>(null) }

    //rememberLauncherForActivityResult: Versión Compose de ActivityResultLauncher

    val cameraLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.TakePicturePreview()
    ) { bitmap: Bitmap? ->

        // Si la captura es exitosa, actualiza imageBitmap
        if (bitmap != null) {
            imageBitmap = bitmap
        } else {
            Toast.makeText(
                context,
                "Captura cancelada o error",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                cameraLauncher.launch(null)
            },
            modifier = Modifier.padding(bottom = 24.dp)
        ) {
            Text(
                text = "Abrir Cámara",
                fontSize = 18.sp
            )
        }

        Box(
            modifier = Modifier
                .size(300.dp)
                .background(Color.LightGray),
            contentAlignment = Alignment.Center
        ) {

            if (imageBitmap != null) {
                Image(
                    bitmap = imageBitmap!!.asImageBitmap(),
                    contentDescription = "Imagen capturada",
                    modifier = Modifier.fillMaxSize()
                )
            } else {
                // Muestra texto cuando no hay imagen
                Text(
                    text = "Sin imagen",
                    color = Color.Gray
                )
            }
        }
    }
}