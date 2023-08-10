package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VCactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vcactivity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }
}