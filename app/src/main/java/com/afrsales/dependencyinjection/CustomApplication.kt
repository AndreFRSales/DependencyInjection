package com.afrsales.dependencyinjection

import android.app.Application
import org.koin.core.context.startKoin

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin { modules(appModule) }
    }

}