package com.example.mvvm.api

import com.example.mvvm.model.ResponseApi
import com.example.mvvm.utils.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getAllCharacters(
        // @Query("count") size:Int,
        @Query("page") page: Int

    ): Response<ResponseApi>
}