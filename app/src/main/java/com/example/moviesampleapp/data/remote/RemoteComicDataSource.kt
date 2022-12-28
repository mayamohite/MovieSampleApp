package com.example.moviesampleapp.data.remote

import com.example.moviesampleapp.data.ComicDataSource
import com.example.moviesampleapp.data.mapper.ComicModelMapper
import com.example.moviesampleapp.home.ComicModel
import com.example.moviesampleapp.util.UiState
import java.lang.Exception
import javax.inject.Inject

class RemoteComicDataSource @Inject constructor(
    private val comicApi: ComicApi,
    private val mapper: ComicModelMapper,
) : ComicDataSource {

    override suspend fun getComicList(): UiState<List<ComicModel>> {
        return try {
            val result = comicApi.getComicList()
            UiState.Success(mapper.mapTo(result))
        } catch (ex: Exception) {
            UiState.Error(ex.message.toString())
        }
    }
}