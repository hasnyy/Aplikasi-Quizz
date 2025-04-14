package com.example.quiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home_login)

        val buttonsignup = findViewById<Button>(R.id.signup1)
        buttonsignup.setOnClickListener {
            val pindah = Intent(this@MainActivity, signUpActifity::class.java)
            startActivity(pindah)
        }
        val buttonlogin = findViewById<Button>(R.id.login)
        buttonlogin.setOnClickListener{
            val pindah = Intent(this@MainActivity, ini_home::class.java)
            startActivity(pindah)
        }
    }
}
