package com.afrsales.dependencyinjection

class MainPresenter {

    private val mainRepo = MainRepo()

    fun fetchData() = mainRepo.fetchInitialState()



}