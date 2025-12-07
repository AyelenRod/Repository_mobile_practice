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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.examen.data.local.AppDatabase
import com.example.examen.data.model.AnimeEntity
import com.example.examen.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavoritesScreen(navController: NavController) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val db = remember { AppDatabase.getDatabase(context) }
    var favList by remember { mutableStateOf<List<AnimeEntity>>(emptyList()) }

    LaunchedEffect(Unit) {
        favList = db.animeDao().getAllFavorites()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mis Favoritos", color = HaikyuuBeige) },
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
            if (favList.isEmpty()) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text("No tienes favoritos guardados", color = HaikyuuBlueGrey)
                }
            } else {
                LazyColumn(contentPadding = PaddingValues(16.dp)) {
                    items(favList) { anime ->
                        AnimeItem(
                            anime = anime,
                            isFavoriteScreen = true,
                            onClick = {
                            },
                            onDelete = {
                                scope.launch {
                                    db.animeDao().deleteFavorite(anime)
                                    favList = db.animeDao().getAllFavorites()
                                    Toast.makeText(context, "Eliminado", Toast.LENGTH_SHORT).show()
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}