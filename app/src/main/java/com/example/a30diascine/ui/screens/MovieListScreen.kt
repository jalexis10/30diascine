package com.example.a30diascine.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.a30diascine.data.movieList
import com.example.a30diascine.ui.screens.MovieCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MovieListScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("30 Días de Cine")
                }
            )
        }
    ) { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(movieList) { movie ->
                MovieCard(movie)
            }
        }
    }
}
