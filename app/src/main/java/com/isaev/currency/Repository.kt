package com.isaev.currency

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Repository {
    private const val BASE_URL = "https://www.cbr-xml-daily.ru/"

    private val gson = GsonBuilder().create()

    private val retrofit = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(ApiService::class.java)

    suspend fun getCurrency(): ValuteData = retrofit.getCurrency()
}