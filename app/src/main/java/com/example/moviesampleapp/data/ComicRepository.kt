package com.example.moviesampleapp.data

import com.example.moviesampleapp.home.ComicModel
import com.example.moviesampleapp.util.UiState

interface ComicRepository {
    suspend fun getComicList(): UiState<List<ComicModel>>
}