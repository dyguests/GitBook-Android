package com.fanhl.gitbook.rest.services

import com.squareup.okhttp.ResponseBody
import retrofit.http.GET
import rx.Observable

/**
 * Created by fanhl on 16/4/15.
 */
interface OauthService {
    @GET("/oauth/authorize?response_type=code&redirect_uri=https://github.com/dyguests/GitBook-Android&client_id=57103a47f9786b100031cc05")
    fun authorize(): Observable<ResponseBody>
}