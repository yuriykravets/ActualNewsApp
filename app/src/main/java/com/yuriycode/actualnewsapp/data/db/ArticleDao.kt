package com.yuriycode.actualnewsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.yuriycode.actualnewsapp.models.Article

interface ArticleDao {

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles(): LiveData<List<Article>>

    @Insert(onConflict = OnConflictStrategy.REPLACE) //for the conflicts
    suspend fun insert(article:Article)

    @Delete
    suspend fun delete(article:Article)

}