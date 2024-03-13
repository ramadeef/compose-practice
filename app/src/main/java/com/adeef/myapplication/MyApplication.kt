package com.adeef.myapplication

import android.app.Application
import com.adeef.myapplication.inventory.data.AppDataContainer
import com.adeef.myapplication.mars.data.AppContainer
import com.adeef.myapplication.mars.data.DefaultAppContainer

class MyApplication : Application() {
    lateinit var container: AppContainer
    lateinit var dataContainer: com.adeef.myapplication.inventory.data.AppContainer
    override fun onCreate() {
        super.onCreate()
        dataContainer = AppDataContainer(this)
        container = DefaultAppContainer()
    }
}