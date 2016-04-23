package com.fanhl.gitbook.rest.services

import com.squareup.okhttp.ResponseBody
import retrofit.http.GET
import rx.Observable

/**
 * Created by fanhl on 16/4/23.
 */
interface BookService {
    @GET("/books/")
    fun getBooks(): Observable<ResponseBody>
}