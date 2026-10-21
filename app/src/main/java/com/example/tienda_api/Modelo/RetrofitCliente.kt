package com.example.tienda_api.Modelo

import com.example.tienda_api.InterfaceApi.ApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlin.lazy

object RetrofitCliente {

    private const val BASE_URL = "http://192.168.137.1/tienda_api/" //aqui va la url del api

    private val jsonConfig = Json {
        ignoreUnknownKeys = true
        coerceInputValues = true
        isLenient = true
    }

    val apiService: ApiService by lazy {
        val contenType = "application/json".toMediaType()
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(jsonConfig.asConverterFactory(contentType = contenType))
            .build()
            .create(ApiService::class.java)
    }
}