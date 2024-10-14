package com.ladisa.project_kotlin_mobileapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salti.project_kotlin_mobileapp.R

class LoginPageActivity : AppCompatActivity() {

    private lateinit var eUsername : EditText
    private lateinit var ePassword : EditText
    private lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        eUsername = findViewById(R.id.eUsername)
        ePassword = findViewById(R.id.ePassword)
        btnLogin = findViewById(R.id.btnLogin2)

        btnLogin.setOnClickListener(){

            val nUsername = eUsername.text.toString() //ini ngambil dari edit text kemudian convert ke string
            val nPassword = ePassword.text.toString()

            //Passing data --> pengiriman data atau value dari satu activity ke activity lain
            //Intent --> put extras --> ini untuk penyimpanan dan pengiriman
            //get extras --> ini untuk pengambilan

            val intentPassingData = Intent(this@LoginPageActivity,
                WelcomePageActivity::class.java)
            //proses put data
            intentPassingData.putExtra("username", nUsername)
            intentPassingData.putExtra("password", nPassword)
            //cek data ada apa tidak, LOGCAT
            Log.d("cek data username", nUsername)
            Log.d("cek data password", nPassword)
            //pindah dan membawa data nya
            startActivity(intentPassingData)

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}