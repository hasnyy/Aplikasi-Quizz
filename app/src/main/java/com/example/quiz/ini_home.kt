package com.example.quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ini_home : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ini_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonhtml = findViewById<CardView>(R.id.html)
        buttonhtml.setOnClickListener{
            val html = Intent(this@ini_home, soal::class.java)
            startActivity(html)
        }

        val buttonjavascript = findViewById<CardView>(R.id.js)
        buttonjavascript.setOnClickListener{
            val js = Intent(this@ini_home, soal::class.java)
            startActivity(js)
        }

        val buttonreactjs = findViewById<CardView>(R.id.reactjs)
        buttonreactjs.setOnClickListener({
            val reactjs = Intent(this@ini_home, soal::class.java)
            startActivity(reactjs)
        })

        val buttonc = findViewById<CardView>(R.id.c)
        buttonc.setOnClickListener({
            val c = Intent(this@ini_home, soal::class.java)
            startActivity(c)
        })

        val buttonpython = findViewById<CardView>(R.id.python)
        buttonpython.setOnClickListener({
            val python = Intent(this@ini_home, soal::class.java)
            startActivity(python)
        })

    }
}