package com.example.examen2.presentation.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.examen2.data.local.AppDatabase
import com.example.examen2.data.local.User
import com.example.examen2.data.local.UserDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class FormViewModel(application: Application) : AndroidViewModel(application) {
    private val userDao: UserDao

    val allUsers: Flow<List<User>>

    init {
        val database = AppDatabase.getDatabase(application.applicationContext)
        userDao = database.userDao()
        allUsers = userDao.getAllUsers()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )
    }

    fun addUser(name: String, email: String, password: String) {
        viewModelScope.launch {
            if (name.isNotBlank() && email.isNotBlank() && password.isNotBlank()) {
                val newUser = User(name = name, email = email, password = password)
                userDao.insertUser(newUser)
            }
        }
    }

    fun clearAllUsers() {
        viewModelScope.launch {
        }
    }
}