package com.example.examen2.presentation.views

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DarkMode
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2.presentation.viewmodel.ThemeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemeApp(
    onNavigateBack: () -> Unit,
    themeViewModel: ThemeViewModel = viewModel()
) {
    val isDarkTheme by themeViewModel.isDarkTheme.collectAsState(initial = false)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Configuración del Tema") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Filled.ArrowBack, contentDescription = "Regresar")
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Icono grande del tema actual (sol/luna)
            Icon(
                imageVector = if (isDarkTheme) Icons.Filled.DarkMode else Icons.Filled.LightMode,
                contentDescription = "Icono de Tema",
                modifier = Modifier.size(120.dp),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(24.dp))

            // Card informativa del tema actual
            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.surfaceVariant
                )
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Tema Actual:",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Text(
                        text = if (isDarkTheme) "Oscuro" else "Claro",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
            Spacer(modifier = Modifier.height(48.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Iconos en los botones de cambio
                Button(
                    onClick = { themeViewModel.toggleTheme(isDark = false) },
                    modifier = Modifier
                        .weight(1f)
                        .height(56.dp)
                ) {
                    Icon(Icons.Filled.LightMode, contentDescription = "Tema Claro")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Claro")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(
                    onClick = { themeViewModel.toggleTheme(isDark = true) },
                    modifier = Modifier
                        .weight(1f)
                        .height(56.dp)
                ) {
                    Icon(Icons.Filled.DarkMode, contentDescription = "Tema Oscuro")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Oscuro")
                }
            }
        }
    }
}