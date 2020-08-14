package com.afrsales.dependencyinjection

import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainPresenterTest {

    private val mainRepo = mockk<MainRepo>()

    private val presenter = MainPresenter(mainRepo)

    @Test
    fun givenAskToFetch_WhenReceiveSuccessfulResponse_ShouldReturnSomeString() {
        every { mainRepo.fetchInitialState() } returns "Success"
        val response = presenter.fetchData()
        assertEquals(response, "Success")
    }

    @Test
    fun givenAskToFetch_WhenReceiveFailureResponse_ShouldReturnErrorString() {
        every { mainRepo.fetchInitialState() } returns "Failure"
        val response = presenter.fetchData()
        assertEquals(response, "Failure")
    }

}