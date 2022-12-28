package com.example.moviesampleapp.di

import com.example.moviesampleapp.data.ComicDataSource
import com.example.moviesampleapp.data.remote.RemoteComicDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    abstract fun bindRemoteDataSource(remoteComicDataSource: RemoteComicDataSource): ComicDataSource
}