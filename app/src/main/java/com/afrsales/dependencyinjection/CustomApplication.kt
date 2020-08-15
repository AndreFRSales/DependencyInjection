package com.afrsales.dependencyinjection

import android.app.Application

class CustomApplication: Application() {

    val appContainer = AppContainer()

}