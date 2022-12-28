package com.example.moviesampleapp.di

import com.example.moviesampleapp.data.ComicRepository
import com.example.moviesampleapp.data.ComicRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindRepository(comicRepositoryImpl: ComicRepositoryImpl): ComicRepository
}