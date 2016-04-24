package com.fanhl.gitbook.rest.services

import com.fanhl.gitbook.rest.model.Auth
import com.fanhl.gitbook.rest.model.LoginParam
import com.squareup.okhttp.ResponseBody
import retrofit.http.*
import rx.Observable

/**
 * Created by fanhl on 16/4/15.
 */
interface OauthService {
    @Headers("Content-Type: application/json")
    @PUT("/authorizations/clients/{clientId}")
    fun basicLogin(@Header("Authorization") authorization: String,
                   @Path("clientId") clientId: String,
                   @Body loginParam: LoginParam): Observable<Auth>


    @GET("/oauth/authorize?response_type=code&redirect_uri=https://github.com/dyguests/GitBook-Android&client_id=57103a47f9786b100031cc05")
    @Deprecated(message = "Do not use this")
    fun authorize(): Observable<ResponseBody>
}