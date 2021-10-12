package com.example.databinding.Network

import com.example.databinding.Api.APIClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object Network {

    private const val BASE_URL = "https://run.mocky.io/"


    fun provideAPIService(): APIClient {
        val builder = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return builder.create(APIClient::class.java)
    }


}