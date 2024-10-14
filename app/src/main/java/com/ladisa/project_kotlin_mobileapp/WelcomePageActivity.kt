package com.ladisa.project_kotlin_mobileapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.salti.project_kotlin_mobileapp.R

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var  txtWelcome : TextView
    private lateinit var btnHomePage2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)

        txtWelcome = findViewById(R.id.txtWelcome)
        // get data yang telah di put extras intent
        btnHomePage2 = findViewById(R.id.btnHomePage2) // inisialisasi btnHomePage

        val getDataUsername = intent.getStringExtra("username")
        val getDataPassword = intent.getStringExtra("password")
        //tampilkan hasil setelah di get
        txtWelcome.setText("Hello ${getDataUsername}!\n Password anda adalah : ${getDataPassword}")

        btnHomePage2.setOnClickListener{
            val intent = Intent(this, LoginPageActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}