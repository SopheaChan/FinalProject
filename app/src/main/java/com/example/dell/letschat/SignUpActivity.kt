package com.example.dell.letschat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dell.letschat.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        setSupportActionBar(signUpToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
