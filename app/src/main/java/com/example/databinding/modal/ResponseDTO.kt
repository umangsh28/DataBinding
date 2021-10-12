package com.example.databinding.modal


import com.google.gson.annotations.SerializedName

data class ResponseDTO(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val Results: List<Result>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)