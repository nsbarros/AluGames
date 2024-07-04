package org.example

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CheapSharkService {
    @GET("games")
    fun getGames(@Query("id") id: Int): Call<String>
}