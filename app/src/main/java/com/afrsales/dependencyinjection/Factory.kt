package com.afrsales.dependencyinjection

interface Factory<T> {
    fun create(): T
}