package com.afrsales.dependencyinjection

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainPresenterTest {

    private val presenter = MainPresenter()

    @Test
    fun givenAskToFetch_WhenReceiveSuccessfulResponse_ShouldReturnSomeString() {
        val response = presenter.fetchData()
        assertEquals(response, "Success")
    }

    @Test
    fun givenAskToFetch_WhenReceiveFailureResponse_ShouldReturnErrorString() {
        val response = presenter.fetchData()
        assertEquals(response, "Failure")
    }

}