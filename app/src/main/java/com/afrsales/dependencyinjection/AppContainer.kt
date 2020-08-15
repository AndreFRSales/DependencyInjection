package com.afrsales.dependencyinjection

class AppContainer {

    private val mainData = MainData()
    private val mainRepo = MainRepo(mainData)

    val mainPresenterFactory = MainPresenterFactory(mainRepo)
}