package com.example.webtoon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.webtoon.data.WebtoonDatabase
import com.example.webtoon.data.WebtoonRepository
import com.example.webtoon.ui.theme.AppNavGraph
 import com.example.webtoon.viewmodel.WebtoonViewModel
import com.example.webtoon.viewmodel.WebtoonViewModelFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val database = WebtoonDatabase.getDatabase(applicationContext)
        val repository = WebtoonRepository(database.webtoonDao())

        setContent {

            val navController = rememberNavController()

            val viewModel: WebtoonViewModel = viewModel(
                factory = WebtoonViewModelFactory(repository)
            )
             AppNavGraph(navController = navController, viewModel = viewModel)
        }
    }
}


