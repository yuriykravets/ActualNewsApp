package com.yuriycode.actualnewsapp.data.api

import com.yuriycode.actualnewsapp.data.db.ArticleDao
import com.yuriycode.actualnewsapp.models.Article
import javax.inject.Inject


class NewsRepository @Inject constructor(private val newsService: NewsService) {
    suspend fun getNews(countryCode: String, pageNumber: Int) =
        newsService.getHeadlines(countryCode = countryCode, page = pageNumber)

    suspend fun getSearchNews(query: String, pageNumber: Int) =
        newsService.getEverything(query = query, page = pageNumber)
}