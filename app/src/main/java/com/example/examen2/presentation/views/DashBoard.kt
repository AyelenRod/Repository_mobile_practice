package com.example.examen2.presentation.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.examen2.presentation.components.NormalButton


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashBoard(
    onNavigateToTheme: () -> Unit,
    onNavigateToForm: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Examen II - 243681") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NormalButton(
                title = "Cambiar Tema",
                onClick = onNavigateToTheme
            )

            NormalButton(
                title = "Ir a Formulario",
                onClick = onNavigateToForm
            )
        }
    }
}
