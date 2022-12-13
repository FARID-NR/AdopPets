package com.example.adoppets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUP = findViewById<Button>(R.id.signUP)
        val signUp2 = findViewById<TextView>(R.id.textView8)

        signUP.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistActivity::class.java))
        }

        signUp2.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegistActivity::class.java))
        }
    }
}