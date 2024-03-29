package com.isaev.currency

import com.google.gson.annotations.SerializedName

data class ValuteData(
    @SerializedName("Date") val date: String,
    @SerializedName("Timestamp") val timestamp: String,
    @SerializedName("Valute") val valute: List<Valute>
)



data class Valute(
    @SerializedName("ID") val id: String,
    @SerializedName("NumCode") val numCode: String,
    @SerializedName("CharCode") val charCode: String,
    @SerializedName("Nominal") val nominal: Int,
    @SerializedName("Name") val name: String,
    @SerializedName("Value") val value: String,
    @SerializedName("Previous") val prevValue: String
)