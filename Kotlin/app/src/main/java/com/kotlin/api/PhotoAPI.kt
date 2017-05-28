package com.kotlin.api

import com.kotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Joe on 5/28/2017.
 */
interface PhotoAPI {
    @GET("?key=5486645-4e3060efb55374e20dcc474c3&q=nature&image_type=photo")
    fun getPhotos(): Call<PhotoList>
}