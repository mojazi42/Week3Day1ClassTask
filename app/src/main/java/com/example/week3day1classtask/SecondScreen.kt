package com.example.week3day1classtask

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, userInput: String) {
    Scaffold(
        topBar = { TopBar(title = "Second Screen", showBackButton = true, navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Second Screen")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Saved Text: $userInput")
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { navController.popBackStack() }) {
                Text("Go Back")
            }
        }
    }
}
