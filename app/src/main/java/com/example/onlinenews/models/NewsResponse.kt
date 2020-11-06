package com.example.onlinenews.models

import com.example.onlinenews.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)