package com.example.framgiaphamtheanh.facebooknewsfeed.signin

import android.content.Intent
import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import com.example.framgiaphamtheanh.facebooknewsfeed.R
import com.example.framgiaphamtheanh.facebooknewsfeed.newfeed.NewFeedActivity

class SignInActivity : AppCompatActivity(), SignInPresenter.View {
    private var presenter = SignInPresenterImpl(this)
    private lateinit var mBtnSignIn: Button
    override fun onSignInSuccess() {
        var intent = Intent(this, NewFeedActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        mBtnSignIn = findViewById(R.id.btn_sign_in)
        mBtnSignIn.setOnClickListener({ presenter.login("", "") })
    }
}
