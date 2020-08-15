package com.afrsales.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setup()
    }

    private fun setup() {
        val appContainer = (application as CustomApplication).appContainer
        presenter = appContainer.mainPresenterFactory.create()
        val response = presenter.fetchData()
        val text: TextView = findViewById(R.id.mainText)
        text.text = response
    }
}