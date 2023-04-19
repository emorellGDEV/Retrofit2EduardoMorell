package com.example.retrofit2

import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    @GET("/0.2/languages")
    suspend fun getLanguages(): Response<List<Language>>


    @Headers("Authorization: Bearer 4e7342c724cbc79c80550674681da03b")
    @FormUrlEncoded
    @POST("/0.2/detect")
    suspend fun detectLanguage(@Field("q") text:String) : Response<DetectionResponse>


}

