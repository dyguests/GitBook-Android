package com.fanhl.gitbook.rest

import com.fanhl.gitbook.constants.Constants
import com.fanhl.gitbook.rest.services.BookService
import com.fanhl.gitbook.rest.services.OauthService
import dagger.Module
import dagger.Provides
import retrofit.GsonConverterFactory
import retrofit.Retrofit
import retrofit.RxJavaCallAdapterFactory
import javax.inject.Singleton

/**
 * REST通信总Module
 *
 * Created by fanhl on 16/4/18.
 */
@Module
class RestModule {

    /**
     * 创建Retrofit客户端
     */
    @Singleton @Provides fun provideRetrofit() = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Singleton @Provides fun provideOauthService(retrofit: Retrofit) = retrofit.create(OauthService::class.java)
    @Singleton @Provides fun provideBookService(retrofit: Retrofit) = retrofit.create(BookService::class.java)
}