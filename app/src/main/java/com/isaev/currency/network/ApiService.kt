package com.isaev.currency.network

import retrofit2.http.GET

interface ApiService {
    @GET("daily_json.js")
    suspend fun getCurrency(): ValuteData
}