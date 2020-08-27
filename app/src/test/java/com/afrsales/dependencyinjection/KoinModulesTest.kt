package com.afrsales.dependencyinjection

import org.junit.Test
import org.junit.experimental.categories.Category
import org.koin.test.AutoCloseKoinTest
import org.koin.test.category.CheckModuleTest
import org.koin.test.check.checkModules

@Category(CheckModuleTest::class)
class KoinModulesTest : AutoCloseKoinTest() {

    @Test
    fun checkModules() {
        checkModules {
            modules(appModule)
        }
    }
}