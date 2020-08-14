package com.afrsales.dependencyinjection

class MainRepo(private val mainData: MainData) {

    fun fetchInitialState(): String = mainData.fetchDataFromSomePlace()

}