package com.example.quiz

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signUpActifity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_actifity)

        val btnKembali = findViewById<Button>(R.id.loginkembali)
        btnKembali.setOnClickListener {
            finish()
        }
    }
}