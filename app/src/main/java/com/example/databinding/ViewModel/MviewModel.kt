package com.example.databinding.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.databinding.Api.MainRepo
import com.example.databinding.modal.ResponseDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MviewModel : ViewModel() {

    private val mainRepo=MainRepo()

    val mutableLiveaData= MutableLiveData<ResponseDTO>()

    val livedata: LiveData<ResponseDTO> get() = mutableLiveaData



    fun callApi(){
        mainRepo.getAll().enqueue(object : Callback<ResponseDTO> {
            override fun onResponse(p0: Call<ResponseDTO>, response: Response<ResponseDTO>){
                val res:ResponseDTO=response.body()!!
                mutableLiveaData.value=res
            }

            override fun onFailure(p0: Call<ResponseDTO>, p1: Throwable){
                Log.d("Tag",p1.message.toString())


            }


        })



    }

}