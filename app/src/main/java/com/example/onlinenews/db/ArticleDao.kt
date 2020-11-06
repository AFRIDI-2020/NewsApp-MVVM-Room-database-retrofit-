package com.example.onlinenews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.onlinenews.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article) : Long

    @Query("SELECT * FROM article")
    fun getAllArticles() : LiveData<List<Article>>

    @Delete
    suspend fun delete(article: Article)
}