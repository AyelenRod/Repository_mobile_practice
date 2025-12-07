package com.example.examen.ui.view

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.examen.data.local.AppDatabase
import com.example.examen.data.model.AnimeEntity
import com.example.examen.ui.theme.*
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController) {
    val anime = navController.previousBackStackEntry?.savedStateHandle?.get<AnimeEntity>("anime")

    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val db = remember { AppDatabase.getDatabase(context) }
    var isFavorite by remember { mutableStateOf(false) }

    LaunchedEffect(anime) {
        if (anime != null) {
            isFavorite = db.animeDao().isFavorite(anime.id)
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(anime?.title ?: "Detalle", color = HaikyuuBeige) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = HaikyuuBlueGrey)
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    if (anime != null) {
                        scope.launch {
                            if (!isFavorite) {
                                db.animeDao().insertFavorite(anime)
                                isFavorite = true
                                Toast.makeText(context, "Guardado en Favoritos", Toast.LENGTH_SHORT).show()
                            } else {
                                Toast.makeText(context, "Ya está guardado", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                },
                containerColor = HaikyuuOrange
            ) {
                Icon(
                    imageVector = if (isFavorite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = "Fav",
                    tint = HaikyuuWhite
                )
            }
        }
    ) { padding ->
        if (anime != null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
                    .background(HaikyuuBeige)
                    .padding(16.dp)
            ) {
                AsyncImage(
                    model = anime.imageUrl,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(350.dp)
                        .clip(RoundedCornerShape(16.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = anime.title,
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    color = HaikyuuBlack
                )

                Text(
                    text = "Score: ${anime.score} / 10",
                    fontSize = 20.sp,
                    color = HaikyuuBlueGrey,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp)
                )

                Divider(color = HaikyuuBlueGrey, thickness = 1.dp)

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = anime.synopsis,
                    fontSize = 16.sp,
                    color = Color.DarkGray,
                    lineHeight = 24.sp
                )
            }
        }
    }
}