package com.example.webtoon.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "webtoon_table")
data class Webtoon(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    var title: String = "",
    var imageUrl: String = "",
    var description: String = "",
    var rating: Float = 0f,
    var briefDescription: String
)




