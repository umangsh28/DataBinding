package com.example.databinding.Api

import com.example.databinding.modal.ResponseDTO
import com.example.databinding.Network.Network
import retrofit2.Call

class MainRepo {

    fun getAll(): Call<ResponseDTO> {
        return Network.provideAPIService().getAPIResponse()
    }
}