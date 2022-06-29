package com.yuriycode.actualnewsapp.data.api

import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService) {
    suspend fun getNews(countrycode:String, pageNumber:Int) {
        newsService.getHeadlines(countryCode = countrycode, page = pageNumber)
    }
}