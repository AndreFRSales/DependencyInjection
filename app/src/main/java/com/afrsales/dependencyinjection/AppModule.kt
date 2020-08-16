package com.afrsales.dependencyinjection

import org.koin.dsl.module

val appModule = module {
        single { MainData() }
        single { MainRepo(get())}
        factory { MainPresenter(get()) }
}
