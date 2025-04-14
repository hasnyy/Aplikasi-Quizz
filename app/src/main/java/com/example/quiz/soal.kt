package com.example.quiz

import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class soal : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_soal)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonprevious = findViewById<Button>(R.id.previous)
        buttonprevious.setOnClickListener{
            val kembali = Intent(this@soal, ini_home::class.java)
            startActivity(kembali)
        }
        val buttonnext = findViewById<Button>(R.id.next)
        buttonnext.setOnClickListener{
            val lanjut = Intent(this@soal, ini_home::class.java)
            startActivity(lanjut)
        }

        val buttonpanah1 = findViewById<ImageView>(R.id.panah1)
        buttonpanah1.setOnClickListener{
            finish();
        }



        val pilihanA = findViewById<CardView>(R.id.a)
        val jawaban1 = findViewById<TextView>(R.id.jwb1)
        val pilihanB = findViewById<CardView>(R.id.b)
        val jawaban2 = findViewById<TextView>(R.id.jwb2)
        val pilihanC = findViewById<CardView>(R.id.c)
        val jawaban3 = findViewById<TextView>(R.id.jwb3)
        val pilihanD = findViewById<CardView>(R.id.d)
        val jawaban4 = findViewById<TextView>(R.id.jwb4)

        pilihanA.setOnClickListener{
            pilihanA.setBackgroundColor(ContextCompat.getColor(this, R.color.pilihan))
            jawaban1.setTextColor(ContextCompat.getColor(this, R.color.jawaban))
            pilihanB.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban2.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanC.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban3.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanD.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban4.setTextColor(ContextCompat.getColor(this, R.color.black))
        }

        pilihanB.setOnClickListener{
            pilihanB.setBackgroundColor(ContextCompat.getColor(this, R.color.pilihan))
            jawaban2.setTextColor(ContextCompat.getColor(this, R.color.jawaban))
            pilihanA.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban1.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanC.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban3.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanD.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban4.setTextColor(ContextCompat.getColor(this, R.color.black))
        }

        pilihanC.setOnClickListener{
            pilihanC.setBackgroundColor(ContextCompat.getColor(this, R.color.pilihan))
            jawaban3.setTextColor(ContextCompat.getColor(this, R.color.jawaban))
            pilihanA.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban1.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanB.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban2.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanD.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban4.setTextColor(ContextCompat.getColor(this, R.color.black))
        }

        pilihanD.setOnClickListener{
            pilihanD.setBackgroundColor(ContextCompat.getColor(this, R.color.pilihan))
            jawaban4.setTextColor(ContextCompat.getColor(this, R.color.jawaban))
            pilihanA.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban1.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanB.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban2.setTextColor(ContextCompat.getColor(this, R.color.black))
            pilihanC.setBackgroundColor(ContextCompat.getColor(this, R.color.white))
            jawaban3.setTextColor(ContextCompat.getColor(this, R.color.black))
        }

    }
}