package com.colorgame.api

import com.colorgame.model.newLevel.GetNewLevel
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST

class Api {
    interface GetLevelAPI{
        @POST("art/stage/next")
        suspend fun getLevel(
            @Header("Authorization") token: String): Response<GetNewLevel>
    }
}