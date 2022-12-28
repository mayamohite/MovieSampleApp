package com.example.moviesampleapp.data

import com.example.moviesampleapp.home.ComicModel
import com.example.moviesampleapp.util.CoroutineDispatcherProvider
import com.example.moviesampleapp.util.UiState
import kotlinx.coroutines.withContext
import javax.inject.Inject

class ComicRepositoryImpl @Inject constructor(
    private val remoteComicDataSource: ComicDataSource,
    private val dispatcher: CoroutineDispatcherProvider
) : ComicRepository {

    override suspend fun getComicList(): UiState<List<ComicModel>> {
        return withContext(dispatcher.io) {
            remoteComicDataSource.getComicList()
        }
    }
}