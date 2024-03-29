package com.isaev.currency.network

sealed class DataState<out T : Any> {
    data class Success<T : Any>(val data: T) : DataState<T>()
    data class Failure(val exception: Exception) : DataState<Nothing>()
    data object Loading : DataState<Nothing>()
}