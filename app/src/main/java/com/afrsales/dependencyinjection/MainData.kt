package com.afrsales.dependencyinjection

class MainData {
    fun fetchDataFromSomePlace() =
        when ((1..2).random()) {
            1 -> "Success"
            else -> "Failure"
        }
}