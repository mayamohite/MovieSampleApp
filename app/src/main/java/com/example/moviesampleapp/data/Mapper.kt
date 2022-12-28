package com.example.moviesampleapp.data

abstract class Mapper<in E, T> {
    abstract fun mapTo(from: E): T
}