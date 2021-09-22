package com.example.newzz.api

data class NewsJSON(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)