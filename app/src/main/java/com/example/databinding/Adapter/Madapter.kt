package com.example.databinding.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databinding.Holder.Mholder
import com.example.databinding.modal.ResponseDTO
import com.example.databinding.modal.Result
import com.example.databinding.R
import com.example.databinding.databinding.ItemLayoutBinding

class Madapter(
    private val list: ArrayList<Result>
) : RecyclerView.Adapter<Mholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Mholder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val itemLayoutBinding :ItemLayoutBinding=DataBindingUtil.
        inflate(layoutInflater, R.layout.item_layout,parent,false)
        return Mholder(itemLayoutBinding)
    }

    override fun onBindViewHolder(holder: Mholder, pos: Int) {
       val result: Result = list.get(pos)
        holder.onbind(result,pos)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}