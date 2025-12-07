package com.example.examen.ui.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen.data.model.AnimeEntity
import com.example.examen.data.remote.RetrofitClient
import com.example.examen.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    val context = LocalContext.current
    var animeList by remember { mutableStateOf<List<AnimeEntity>>(emptyList()) }
    var isLoading by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        isLoading = true
        try {
            val response = RetrofitClient.instance.searchAnime("Haikyuu")
            animeList = response.data.map {
                AnimeEntity(
                    id = it.malId,
                    title = it.title,
                    synopsis = it.synopsis ?: "No synopsis",
                    imageUrl = it.images.jpg.imageUrl,
                    score = it.score ?: 0.0
                )
            }
        } catch (e: Exception) {
            Toast.makeText(context, "Error: ${e.message}", Toast.LENGTH_SHORT).show()
        } finally {
            isLoading = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Haikyuu API", color = HaikyuuBeige) },
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
            Button(
                onClick = { navController.navigate("favorites") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = HaikyuuOrange)
            ) {
                Text("Ver Favoritos (Offline)", color = HaikyuuWhite)
            }

            if (isLoading) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(color = HaikyuuOrange)
                }
            } else {
                LazyColumn(contentPadding = PaddingValues(16.dp)) {
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