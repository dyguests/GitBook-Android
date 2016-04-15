package com.fanhl.gitbook

import android.app.Application
import com.fanhl.gitbook.rest.GitBookClient
import com.fanhl.gitbook.rest.services.OauthService

/**
 * Base Application
 * Created by fanhl on 16/4/14.
 */
class App : Application() {
    lateinit var graph: AppComponent

    val client by lazy { GitBookClient() }

    val oauthService by lazy { client.retrofit.create(OauthService::class.java) }

    override fun onCreate() {
        super.onCreate()
        graph = DaggerAppComponent.builder().build()
    }
}
