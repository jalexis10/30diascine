package com.example.a30diascine.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.a30diascine.data.Movie
import com.example.a30diascine.ui.theme.DarkGrayCard
import com.example.a30diascine.ui.theme.GreenCard
import com.example.a30diascine.ui.theme.LightGrayCard
import com.example.a30diascine.ui.theme.lightGreen


@Composable
fun MovieCard(movie: Movie) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { expanded = !expanded },
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = LightGrayCard),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Día ${movie.day}: ${movie.title}", style = MaterialTheme.typography.headlineMedium)
            Image(
                painter = painterResource(id = movie.imageRes),
                contentDescription = "Póster de ${movie.title}",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            if (expanded) {
                Text(
                    text = movie.synopsis,
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}
