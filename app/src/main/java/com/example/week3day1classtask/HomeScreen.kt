package com.example.week3day1classtask

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    var text by remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopBar(title = "Home", showBackButton = false, navController) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Home Screen")
            Spacer(modifier = Modifier.height(10.dp))

            BasicTextField(
                value = text,
                onValueChange = { text = it },
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { navController.navigate("second/$text") }) {
                Text("Save & Go to Second Screen")
            }
        }
    }
}
