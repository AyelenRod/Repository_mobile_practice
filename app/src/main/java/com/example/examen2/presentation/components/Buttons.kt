package com.example.examen2.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun NormalButton(
    title: String,
    onClick: () -> Unit,
    modifier: Modifier
) {
    // La función Button va dentro de las llaves de NormalButton
    Button(
        onClick = onClick,
        // Se añade fillMaxWidth() para que ocupe todo el ancho, que es lo más común.
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Text(text = title)
    }
}