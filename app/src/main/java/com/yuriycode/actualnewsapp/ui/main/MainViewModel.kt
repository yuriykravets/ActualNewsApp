package com.yuriycode.actualnewsapp.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yuriycode.actualnewsapp.data.api.NewsRepository
import com.yuriycode.actualnewsapp.models.NewsResponse
import com.yuriycode.actualnewsapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(private val repository: NewsRepository): ViewModel() {

    val newsLiveData: MutableLiveData<Resource<NewsResponse>> = MutableLiveData()
    var newsPage = 1


    init {
        getNews("ua")
    }


    private fun getNews(countryCode: String) =
        viewModelScope.launch {
            newsLiveData.postValue(Resource.Loading())
            val response = repository.getNews(countrycode = countryCode, pageNumber = newsPage)
            if (response.isSuccessful) {

            } else {
                newsLiveData.postValue(Resource.Error(message = "message"))
            }
        }
}