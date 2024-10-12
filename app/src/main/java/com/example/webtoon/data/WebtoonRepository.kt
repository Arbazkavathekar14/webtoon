package com.example.webtoon.data

import kotlinx.coroutines.flow.Flow

class WebtoonRepository(private val webtoonDao: WebtoonDao) {

    suspend fun addFavorite(webtoon: Webtoon) {
        webtoonDao.insertWebtoon(webtoon)
    }


    fun getAllFavorites(): Flow<List<Webtoon>> {
        return webtoonDao.getAllFavorites()
    }


    suspend fun removeFavorite(webtoon: Webtoon) {
        webtoonDao.delete(webtoon)
    }
}


