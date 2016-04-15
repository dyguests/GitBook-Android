package com.fanhl.gitbook

import com.fanhl.gitbook.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * AppComponent
 * Created by fanhl on 16/4/14.
 */
@Singleton
@Component(modules = arrayOf())
interface AppComponent {
    //    fun inject(app: App)
    fun inject(activity: MainActivity)
}