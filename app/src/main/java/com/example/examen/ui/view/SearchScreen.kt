package com.example.examen.ui.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen.data.model.AnimeEntity
import com.example.examen.data.remote.RetrofitClient
import com.example.examen.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    val context = LocalContext.current
    val focusManager = LocalFocusManager.current
    val scope = rememberCoroutineScope()

    var query by remember { mutableStateOf("Haikyuu") }
    var animeList by remember { mutableStateOf<List<AnimeEntity>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }

    fun performSearch() {
        if (query.isBlank()) return

        scope.launch {
            isLoading = true
            focusManager.clearFocus()
            try {
                val response = RetrofitClient.instance.searchAnime(query)
                animeList = response.data.map {
                    AnimeEntity(
                        id = it.malId,
                        title = it.title,
                        synopsis = it.synopsis ?: "Sin descripción disponible.",
                        imageUrl = it.images.jpg.imageUrl,
                        score = it.score ?: 0.0
                    )
                }
            } catch (e: Exception) {
                Toast.makeText(context, "Error de conexión: ${e.message}", Toast.LENGTH_SHORT).show()
            } finally {
                isLoading = false
            }
        }
    }

    LaunchedEffect(Unit) {
        performSearch()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Buscador Haikyuu", color = HaikyuuBeige) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = HaikyuuBlueGrey)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(HaikyuuBeige)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                OutlinedTextField(
                    value = query,
                    onValueChange = { query = it },
                    label = { Text("Buscar anime...") },
                    modifier = Modifier.weight(1f),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = HaikyuuWhite,
                        unfocusedContainerColor = HaikyuuWhite,
                        focusedBorderColor = HaikyuuOrange,
                        cursorColor = HaikyuuOrange
                    ),
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(onSearch = { performSearch() })
                )

                Spacer(modifier = Modifier.width(8.dp))

                Button(
                    onClick = { performSearch() },
                    colors = ButtonDefaults.buttonColors(containerColor = HaikyuuOrange),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.size(56.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Buscar",
                        tint = HaikyuuWhite
                    )
                }
            }

            Button(
                onClick = { navController.navigate("favorites") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = HaikyuuBlueGrey)
            ) {
                Text("Ver Mis Favoritos (Offline)", color = HaikyuuWhite)
            }

            Spacer(modifier = Modifier.height(10.dp))

            if (isLoading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = HaikyuuOrange)
                }
            } else {
                LazyColumn(
                    contentPadding = PaddingValues(16.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(animeList) { anime ->
                        AnimeItem(
                            anime = anime,
                            isFavoriteScreen = false,
                            onClick = {
                                navController.currentBackStackEntry?.savedStateHandle?.set("anime", anime)
                                navController.navigate("details")
                            }
                        )
                    }
                }
            }
        }
    }
}