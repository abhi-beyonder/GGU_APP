package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AmenitiesAuditoriam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities_auditoriam)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}