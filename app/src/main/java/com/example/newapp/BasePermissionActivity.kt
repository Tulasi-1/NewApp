package com.example.newapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newapp.R

class BasePermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_permission)
    }
}