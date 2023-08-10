package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class studentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}