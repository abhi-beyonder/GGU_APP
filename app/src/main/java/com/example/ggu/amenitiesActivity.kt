package com.example.ggu

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class amenitiesActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val lib = findViewById<ImageView>(R.id.library_amenities)
        lib.setOnClickListener {
            val intent = Intent(this, AmenitiesLibrary::class.java)
            startActivity(intent)
        }

        val cafe = findViewById<ImageView>(R.id.cafeteria_amenities)
        cafe.setOnClickListener {
            val intent = Intent(this, AmenitiesCafeteria::class.java)
            startActivity(intent)
        }

        val sports = findViewById<ImageView>(R.id.sports_amenities)
        sports.setOnClickListener {
            val intent = Intent(this, AmenitiesSports::class.java)
            startActivity(intent)
        }

        val auditoriam = findViewById<ImageView>(R.id.auditoriam_amenities)
        auditoriam.setOnClickListener {
            val intent = Intent(this, AmenitiesAuditoriam::class.java)
            startActivity(intent)
        }


    }
}