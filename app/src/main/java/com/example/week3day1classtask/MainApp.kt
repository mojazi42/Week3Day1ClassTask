package com.example.week3day1classtask

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import com.example.week3day1classtask.HomeScreen
import com.example.week3day1classtask.SecondScreen
import com.example.week3day1classtask.SettingsScreen

@Composable
fun MainApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen(navController) }
            composable("second/{userInput}") { backStackEntry ->
                val userInput = backStackEntry.arguments?.getString("userInput") ?: "No data"
                SecondScreen(navController, userInput)
            }
            composable("settings") { SettingsScreen() }
        }
    }
}
