package com.fanhl.gitbook.rest

import com.fanhl.gitbook.constants.Constants
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit.RxJavaCallAdapterFactory

/**
 * GitBook Retrofit Client
 * Created by fanhl on 16/4/14.
 */
class GitBookClient {
    val retrofit by lazy {
        Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()
    }
}