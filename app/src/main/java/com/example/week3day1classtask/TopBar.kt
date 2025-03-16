package com.example.week3day1classtask

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String, showBackButton: Boolean, navController: NavController?) {
    TopAppBar(
        title = { Text(title) },
        navigationIcon = {
            if (showBackButton) {
                IconButton(onClick = { navController?.navigateUp() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            } else null
        }
    )
}
