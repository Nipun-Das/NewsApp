package com.example.newzz

import com.example.newzz.api.NewsJSON
import retrofit2.http.GET

interface APIRequest {

    @GET("/v2/top-headlines?country=in&apiKey=0600ce835017478b999ccff9f68f896e")
    suspend fun getNews() : NewsJSON

}