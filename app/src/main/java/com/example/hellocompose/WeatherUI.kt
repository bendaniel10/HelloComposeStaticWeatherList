package com.example.hellocompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.transform.CircleCropTransformation
import com.google.accompanist.coil.rememberCoilPainter

@Composable
fun WeatherRow(
    summary: String,
    description: String,
    imageUrl: String
) {
    val typography = MaterialTheme.typography
    Row(Modifier.padding(16.dp)) {
        Image(
            painter = rememberCoilPainter(
                request = imageUrl,
                requestBuilder = {
                    transformations(CircleCropTransformation())
                },
            ),
            contentDescription = null,
            modifier = Modifier
                .height(48.dp)
                .width(48.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(summary, style = typography.body1)
            if (description.isNotBlank()) {
                Text(description, style = typography.body2)
            }
        }
    }
}

@Composable
fun WeatherLazyColumn(list: List<WeatherForecast>) {
    LazyColumn {
        items(list) { item ->
            WeatherRow(
                summary = item.summary,
                description = item.description,
                imageUrl = item.imageUrl
            )
        }
    }
}