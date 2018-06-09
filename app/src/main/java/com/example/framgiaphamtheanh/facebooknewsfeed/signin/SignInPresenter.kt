package com.example.framgiaphamtheanh.facebooknewsfeed.signin

interface SignInPresenter {
    interface View {
        fun onSignInSuccess()
    }

    interface Presenter {
        fun login(username: String, password: String)
    }
}