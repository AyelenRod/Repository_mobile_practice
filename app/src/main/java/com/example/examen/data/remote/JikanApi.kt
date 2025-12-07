package com.example.examen.data.remote

import com.example.examen.data.model.JikanResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface JikanApi {
    @GET("anime")
    suspend fun searchAnime(@Query("q") query: String): JikanResponse
}

object RetrofitClient {
    private const val BASE_URL = "https://api.jikan.moe/v4/"

    val instance: JikanApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JikanApi::class.java)
    }
}