package com.fanhl.gitbook

import android.app.Application

/**
 * Created by fanhl on 16/4/14.
 */
class App : Application() {
    lateinit var graph: AppComponent
    override fun onCreate() {
        super.onCreate()
        graph = DaggerAppComponent.builder().build()
    }
}
