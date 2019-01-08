package com.example.dell.letschat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dell.letschat.R
import kotlinx.android.synthetic.main.activity_search_by_id.*

class SearchByIDActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_by_id)

        setSupportActionBar(toolbar2)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Search by ID"
    }
}
