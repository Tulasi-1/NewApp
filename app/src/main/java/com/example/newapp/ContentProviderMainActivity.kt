package com.example.newapp

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newapp.R
import com.google.firestore.v1.Cursor

class ContentProviderMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_provider_main)
        val uriSms: Uri = Uri.parse("content://sms/inbox")




    }
}