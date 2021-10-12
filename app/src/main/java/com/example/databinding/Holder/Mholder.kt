package com.example.databinding.Holder

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.modal.Result
import com.example.databinding.databinding.ItemLayoutBinding

class Mholder(private val itemLayoutBinding: ItemLayoutBinding):RecyclerView.ViewHolder(itemLayoutBinding.root) {


    fun onbind(result:Result,pos:Int){
        Log.e("TAG",result.toString())
        itemLayoutBinding.moviesitem =result
    }

}