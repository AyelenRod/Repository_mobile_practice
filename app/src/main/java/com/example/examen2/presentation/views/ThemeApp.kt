package com.example.examen2.presentation.views

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2.presentation.viewmodel.ThemeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemeApp(
    onNavigateBack: () -> Unit,
    themeViewModel: ThemeViewModel = viewModel()
) {
    val isDarkTheme by themeViewModel.isDarkTheme.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Ajustes de Tema") }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "El tema actual es: ${if (isDarkTheme) "Oscuro" else "Claro"}",
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Button(
                onClick = { themeViewModel.toggleTheme(false) },
                enabled = isDarkTheme
            ) {
                Text("Poner Tema Claro")
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { themeViewModel.toggleTheme(true) },
                enabled = !isDarkTheme
            ) {
                Text("Poner Tema Oscuro")
            }

            Spacer(modifier = Modifier.height(50.dp))

            Button(onClick = onNavigateBack) {
                Text("Volver al Dashboard")
            }
        }
    }
}
