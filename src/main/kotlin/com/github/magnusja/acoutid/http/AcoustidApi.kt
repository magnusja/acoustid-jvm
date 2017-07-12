package com.github.magnusja.acoutid.http

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by magnusja on 11/07/17.
 */
interface AcoustidApi {
    @GET("lookup")
    fun lookup(@Query("duration") duration: Int,
               @Query("fingerprint") fingerPrint: String)
}