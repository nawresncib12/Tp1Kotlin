package com.example.tp1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPass : EditText
    lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEmail = findViewById(R.id.editTextEmail)
        txtPass = findViewById(R.id.editTextPass)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener { view ->
            var email = txtEmail.text.toString()
            var pass = txtPass.text.toString()
            if(email=="test@insat.tn" && pass=="insat"){
                Toast.makeText(this@MainActivity, "Bienvenue", Toast.LENGTH_LONG).show()
                val intent = Intent(view.context,WelcomeActivity::class.java)
                intent.putExtra("email",email)
                startActivity(intent)


            }else{
                Toast.makeText(this@MainActivity, "Email : $email ou  mot de \n passe : $pass sont incorrectes", Toast.LENGTH_LONG).show()
            }



        }

        var email = txtEmail.text.toString()


    }


}