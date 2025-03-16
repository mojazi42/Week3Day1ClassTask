package com.example.week3day1classtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.week3day1classtask.ui.theme.Week3Day1ClassTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week3Day1ClassTaskTheme {
                MainApp()
            }
        }
    }
}
