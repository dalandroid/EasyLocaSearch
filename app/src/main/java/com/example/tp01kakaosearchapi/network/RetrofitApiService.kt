package com.example.tp01kakaosearchapi.network

import com.example.tp01kakaosearchapi.model.KakaoSearchPlaceResponse
import com.example.tp01kakaosearchapi.model.NidUserInfoResponse
import com.google.cloud.audit.AuthorizationInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface RetrofitApiService {

    // 네아로 사용자 정보 API
    @GET("v1/nid/me")
    fun getNidUserInfo(@Header("Authorization") authorization:String ):Call<NidUserInfoResponse>

    //카카오 키워드 장소검색 API
    @Headers("Authorization: KakaoAK f38d895296d29adb60cb19e60f841a87")
    @GET("/v2/local/search/keyword.json")
    fun searchPlaces(@Query("query") query: String,@Query("x") longitude:String,@Query("y") latitude:String):Call<KakaoSearchPlaceResponse>
}