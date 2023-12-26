package com.example.restaurant_project

import retrofit2.Call
import retrofit2.http.GET

interface MyAPI {
    @GET("menu")
    fun getMenu(): Call<List<Menu>>
}