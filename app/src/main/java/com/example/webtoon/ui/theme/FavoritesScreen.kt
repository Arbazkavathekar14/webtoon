package com.example.webtoon.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.webtoon.data.Webtoon
import com.example.webtoon.viewmodel.WebtoonViewModel

@Composable
fun FavoritesScreen(viewModel: WebtoonViewModel) {
    val favorites by viewModel.favorites.collectAsState(initial = emptyList())
    var selectedWebtoon by remember { mutableStateOf<Webtoon?>(null) }
    var showDialog by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(favorites) { webtoon ->

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            ) {

                Image(
                    painter = rememberAsyncImagePainter(webtoon.imageUrl),
                    contentDescription = webtoon.title,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            selectedWebtoon = webtoon
                            showDialog = true
                        }
                        .height(200.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(8.dp))


                Text(
                    text = webtoon.title,
                    style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                    fontSize = 20.sp
                )

                Spacer(modifier = Modifier.height(4.dp))


                Text(
                    text = webtoon.briefDescription,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize = 16.sp
                )
            }
        }
    }


    if (showDialog && selectedWebtoon != null) {
        AlertDialog(
            onDismissRequest = {
                showDialog = false
                selectedWebtoon = null
            },
            title = { Text("Remove Favorite") },
            text = { Text("Are you sure you want to remove '${selectedWebtoon?.title}' from favorites?") },
            confirmButton = {
                Button(
                    onClick = {
                        selectedWebtoon?.let {
                            viewModel.removeFavorite(it)
                        }
                        showDialog = false
                        selectedWebtoon = null
                    }
                ) {
                    Text("Delete")
                }
            },
            dismissButton = {
                Button(onClick = {
                    showDialog = false
                    selectedWebtoon = null
                }) {
                    Text("Cancel")
                }
            }
        )
    }
}




