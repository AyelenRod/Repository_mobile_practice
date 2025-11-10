package com.example.examen2.presentation.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                title = { Text("Examen II - 243681", fontWeight = FontWeight.Bold) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "¡Bienvenido!",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Selecciona una opción para continuar",
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.height(48.dp))

            NormalButton(
                title = "Ir al Formulario",
                onClick = onNavigateToForm,
                modifier = Modifier.height(56.dp) // ✅ Botones más grandes
            )
            Spacer(modifier = Modifier.height(16.dp))
            NormalButton(
                title = "Cambiar Tema",
                onClick = onNavigateToTheme,
                modifier = Modifier.height(56.dp) // ✅ Botones más grandes
            )
        }
    }
}