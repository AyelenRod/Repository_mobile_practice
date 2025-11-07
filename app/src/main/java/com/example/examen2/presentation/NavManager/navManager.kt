package com.example.examen2.presentation.NavManager

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.examen2.presentation.views.DashBoard
import com.example.examen2.presentation.views.Forms
import com.example.examen2.presentation.views.ThemeApp

object AppRoutes {
    const val DASHBOARD = "dashboard"
    const val THEME = "theme_settings"
    const val FORM = "user_form"
}

@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppRoutes.DASHBOARD
    ) {
        composable(AppRoutes.DASHBOARD) {
            DashBoard(
                onNavigateToTheme = { navController.navigate(AppRoutes.THEME) },
                onNavigateToForm = { navController.navigate(AppRoutes.FORM) }
            )
        }

        composable(AppRoutes.THEME) {
            ThemeApp(
                onNavigateBack = { navController.popBackStack() }
            )
        }

        composable(AppRoutes.FORM) {
            Forms(
                onNavigateBack = { navController.popBackStack() }
            )
        }
    }
}
