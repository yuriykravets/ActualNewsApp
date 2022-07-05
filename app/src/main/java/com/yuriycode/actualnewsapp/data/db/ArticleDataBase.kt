package com.yuriycode.actualnewsapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yuriycode.actualnewsapp.models.Article
import java.util.concurrent.locks.Lock

@Database(entities = [Article::class], version = 1, exportSchema = true)
abstract class ArticleDatabase: RoomDatabase() {

    abstract fun getArticleDao(): ArticleDao

}