package com.example.webtoon.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WebtoonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWebtoon(webtoon: Webtoon)

    @Query("SELECT * FROM webtoon_table")
    fun getAllFavorites(): Flow<List<Webtoon>>

    @Delete
    suspend fun delete(webtoon: Webtoon)
}

