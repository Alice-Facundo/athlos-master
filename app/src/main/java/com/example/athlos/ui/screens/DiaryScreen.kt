package com.example.athlos.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DiaryScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Diário Alimentar", style = MaterialTheme.typography.headlineMedium)

        Text("Café da manhã:")
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 1") })
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 2") })

        Spacer(modifier = Modifier.height(8.dp))
        Text("Almoço:")
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 1") })
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 2") })

        Spacer(modifier = Modifier.height(8.dp))
        Text("Jantar:")
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 1") })
        OutlinedTextField(value = "", onValueChange = {}, label = { Text("Alimento 2") })
    }
}
