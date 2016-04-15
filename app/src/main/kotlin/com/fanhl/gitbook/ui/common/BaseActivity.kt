package com.fanhl.gitbook.ui.common

import android.support.v7.app.AppCompatActivity
import com.fanhl.gitbook.App

/**
 * Base Activity
 * Created by fanhl on 16/4/14.
 */
open class BaseActivity : AppCompatActivity() {
    val app by lazy { application as App }
    val graph by lazy { app.graph }
}