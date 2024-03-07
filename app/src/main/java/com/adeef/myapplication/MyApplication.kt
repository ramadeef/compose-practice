package com.adeef.myapplication

import android.app.Application
import com.adeef.myapplication.mars.data.AppContainer
import com.adeef.myapplication.mars.data.DefaultAppContainer

class MyApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}