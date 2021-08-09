package com.example.loginandauth

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCreateAccount = findViewById<TextView>(R.id.btnCreateAc)
        btnCreateAccount.setOnClickListener {
            // Handler code here.
            val intent = Intent(this
                , Register::class.java)
            startActivity(intent);
        }

        val btnSignIn = findViewById<TextView>(R.id.btnSI)
        btnSignIn.setOnClickListener {
            // Handler code here.
            val intent = Intent(this
                , Activity2::class.java)
            startActivity(intent);
        }
    }


}
