package com.example.webtoon.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.webtoon.data.Webtoon
import com.example.webtoon.data.WebtoonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class WebtoonViewModel(private val repository: WebtoonRepository) : ViewModel() {
    private val _favorites = MutableStateFlow<List<Webtoon>>(emptyList())
    val favorites: StateFlow<List<Webtoon>> = _favorites

    init {

        viewModelScope.launch {
            repository.getAllFavorites().collect { webtoons ->
                _favorites.value = webtoons
            }
        }
    }


    fun addFavorite(webtoon: Webtoon) {
        viewModelScope.launch {
            val existingFavorites = _favorites.value
            if (!existingFavorites.any { it.title == webtoon.title }) {
                repository.addFavorite(webtoon)
            }
        }
    }

    fun removeFavorite(webtoon: Webtoon) {
        viewModelScope.launch {
            repository.removeFavorite(webtoon)
        }
    }
}

