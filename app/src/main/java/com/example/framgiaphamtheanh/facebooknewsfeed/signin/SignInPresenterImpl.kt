package com.example.framgiaphamtheanh.facebooknewsfeed.signin

class SignInPresenterImpl(view: SignInPresenter.View) : SignInPresenter.Presenter {
    private val mView: SignInPresenter.View = view
    override fun login(username: String, password: String) {
        mView.onSignInSuccess()
    }
}