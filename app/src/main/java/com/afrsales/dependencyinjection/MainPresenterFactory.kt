package com.afrsales.dependencyinjection


class MainPresenterFactory(private val repo: MainRepo) : Factory<MainPresenter> {
    override fun create(): MainPresenter = MainPresenter(repo)
}