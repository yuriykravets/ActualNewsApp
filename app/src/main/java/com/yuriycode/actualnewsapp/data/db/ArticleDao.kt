package com.yuriycode.actualnewsapp.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.yuriycode.actualnewsapp.models.Article

interface ArticleDao {

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles(): LiveData<List<Article>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(article: Article)

    @Delete
    suspend fun delete(article: Article)
}