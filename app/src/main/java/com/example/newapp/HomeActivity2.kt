package com.example.newapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View

import android.widget.Toast


class HomeActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
    }

    fun handleClick(view: android.view.View) {
        var intent= Intent(this,
                MainActivity::class.java)
        startActivity(intent)
    }

}