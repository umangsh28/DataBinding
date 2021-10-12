package com.example.databinding.Api


import com.example.databinding.modal.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET

interface APIClient {

    //https://run.mocky.io/v3/890cac28-d921-4686-b189-9c51c6a33295

    @GET("v3/890cac28-d921-4686-b189-9c51c6a33295")
     fun getAPIResponse(): Call<ResponseDTO>

}