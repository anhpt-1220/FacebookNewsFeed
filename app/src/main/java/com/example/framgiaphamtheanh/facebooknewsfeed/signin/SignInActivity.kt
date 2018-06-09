package com.example.framgiaphamtheanh.facebooknewsfeed.signin

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import com.example.framgiaphamtheanh.facebooknewsfeed.R

class SignInActivity : AppCompatActivity(), SignInPresenter.View {
    override fun onSignInSuccess() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
    }
}
