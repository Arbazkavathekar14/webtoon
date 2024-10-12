package com.example.webtoon.ui.theme

import DetailScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.webtoon.viewmodel.WebtoonViewModel


@Composable
fun AppNavGraph(navController: NavHostController, viewModel: WebtoonViewModel) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("detail/{title}/{imageUrl}/{description}/{briefDescription}/{rating}") { backStackEntry ->
            val title = backStackEntry.arguments?.getString("title") ?: ""
            val imageUrl = backStackEntry.arguments?.getString("imageUrl") ?: ""
            val description = backStackEntry.arguments?.getString("description") ?: ""
            val briefDescription = backStackEntry.arguments?.getString("briefDescription") ?: ""
            val rating = backStackEntry.arguments?.getString("rating")?.toFloatOrNull() ?: 0f
            DetailScreen(
                navController = navController,
                title = title,
                imageUrl = imageUrl,
                fullDescription = description,
                viewModel = viewModel,
                briefDescription = briefDescription,
                rating = rating
            )
        }
        composable("favorites") {
            FavoritesScreen(viewModel)
        }

    }
}

