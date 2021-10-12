package com.example.databinding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.databinding.Adapter.Madapter
import com.example.databinding.modal.ResponseDTO
import com.example.databinding.ViewModel.MviewModel
import com.example.databinding.databinding.ActivityMainBinding
import com.example.databinding.modal.Result


class MainActivity : AppCompatActivity() {

    var responseDTO: ResponseDTO?=null
    private val list = ArrayList<Result>()


    private lateinit var mainViewModel:MviewModel

    private lateinit var madapter: Madapter

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        apicalling()

        SetRecycler()


    }

    @SuppressLint("NotifyDataSetChanged")
    private fun apicalling() {
        mainViewModel= ViewModelProvider(this).get(MviewModel::class.java)

        mainViewModel.callApi()

        mainViewModel.livedata.observe(this,{
            it?.let{
                list.addAll(it.Results)
                Log.d("um",it.toString())
            }
            madapter.notifyDataSetChanged()
        })



    }

    private fun SetRecycler() {
         madapter=Madapter(list)
        activityMainBinding.rvPopularMovies.layoutManager=LinearLayoutManager(this)
        activityMainBinding.rvPopularMovies.adapter=madapter

    }
}