package com.example.tugasramadhanmvp

class MainPresenterImp (private val view: ImainView): ImainPresenter {
    override fun countResult(bilangan: Bilangan) {
        val result = bilangan.bilangan1+bilangan.bilangan2
        view.showResult(result)
        view.clearField()
    }

    override fun pengurangan(bilangan: Bilangan) {
        val result = bilangan.bilangan1-bilangan.bilangan2
        view.showToast(result.toString())
    }


}