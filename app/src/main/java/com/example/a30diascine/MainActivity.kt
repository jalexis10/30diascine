package com.example.a30diascine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.a30diascine.ui.screens.NavGraph
import com.example.a30diascine.ui.theme.CineAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CineAppTheme {
                val navController = rememberNavController()
                NavGraph(navController)
            }
        }
    }
}
