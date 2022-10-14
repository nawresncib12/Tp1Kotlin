package com.example.tp1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    lateinit var txtWelcome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        txtWelcome = findViewById(R.id.txtWelcome)
        val email = intent.getStringExtra("email")
        print(email);
        txtWelcome.text = "Bienvenue $email"

    }

}