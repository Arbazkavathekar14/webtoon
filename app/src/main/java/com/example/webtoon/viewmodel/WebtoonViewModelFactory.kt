package com.example.webtoon.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.webtoon.data.WebtoonRepository

class WebtoonViewModelFactory(private val repository: WebtoonRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WebtoonViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WebtoonViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
