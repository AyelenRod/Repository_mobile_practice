package com.example.examen2.presentation.views

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.examen2.presentation.viewmodel.FormViewModel
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Forms(
    onNavigateBack: () -> Unit,
    formViewModel: FormViewModel = viewModel()
) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    val userList by formViewModel.allUsers.collectAsState(initial = emptyList())
    var showSuccessMessage by remember { mutableStateOf(false) }

    LaunchedEffect(showSuccessMessage) {
        if (showSuccessMessage) {
            delay(2000) // Muestra el mensaje por 2 segundos
            showSuccessMessage = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Formulario de Registro") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            Icons.Filled.ArrowBack,
                            contentDescription = "Regresar"
                        )
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
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Formulario de Registro", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))

            // Nombre
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nombre Completo") },
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = { Icon(Icons.Filled.Person, contentDescription = "Nombre") } // ✅ Icono
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email") } // ✅ Icono
            )
            Spacer(modifier = Modifier.height(8.dp))

            // Contraseña
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña") },
                modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Contraseña") }, // ✅ Icono
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                // ✅ Mostrar/ocultar contraseña con botón de ojo
                trailingIcon = {
                    val image = if (passwordVisible) Icons.Filled.Visibility else Icons.Filled.VisibilityOff
                    val description = if (passwordVisible) "Ocultar contraseña" else "Mostrar contraseña"
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, contentDescription = description)
                    }
                }
            )
            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    formViewModel.addUser(name, email, password)
                    name = ""; email = ""; password = ""
                    showSuccessMessage = true // ✅ Activa el mensaje de éxito
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                Text("Guardar Usuario")
            }

            // ✅ Mensaje de éxito animado al guardar
            AnimatedVisibility(
                visible = showSuccessMessage,
                enter = fadeIn(animationSpec = tween(500)),
                exit = fadeOut(animationSpec = tween(500))
            ) {
                Text(
                    "¡Usuario guardado con éxito!",
                    color = MaterialTheme.colorScheme.primary,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }

            Divider(modifier = Modifier.padding(vertical = 24.dp))
            Text("Usuarios Guardados", style = MaterialTheme.typography.headlineSmall)
            Spacer(Modifier.height(16.dp))

            if (userList.isEmpty()) {
                // ✅ Mensaje amigable cuando no hay usuarios
                Text(
                    "Aún no hay usuarios registrados. ¡Sé el primero!",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            } else {
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(userList) { user ->
                        // ✅ Elevación y sombras en las cards
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                        ) {
                            Column(Modifier.padding(16.dp)) {
                                Text("Nombre: ${user.name}", style = MaterialTheme.typography.bodyLarge)
                                Text("Email: ${user.email}", style = MaterialTheme.typography.bodyMedium)
                            }
                        }
                    }
                }
            }
        }
    }
}