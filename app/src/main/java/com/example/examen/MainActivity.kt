package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examen.ui.theme.HaikyuuAppTheme
import com.example.examen.ui.view.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HaikyuuAppTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "loading") {
                    composable("loading") { LoadingScreen(navController) }
                    composable("search") { SearchScreen(navController) }
                    composable("details") { DetailScreen(navController) }
                    composable("favorites") { FavoritesScreen(navController) }
                }
            }
        }
    }
}