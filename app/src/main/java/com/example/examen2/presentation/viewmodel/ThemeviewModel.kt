package com.example.examen2.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen2.data.repository.ThemeRepo
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class ThemeViewModel(application: Application) : AndroidViewModel(application) {

    private val themeRepository = ThemeRepo (application)

    val isDarkTheme: StateFlow<Boolean> = themeRepository.isDarkTheme
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5000),
            initialValue = false
        )
    fun toggleTheme(isDark: Boolean) {
        viewModelScope.launch {
            themeRepository.saveTheme(isDark)
        }
    }
}
