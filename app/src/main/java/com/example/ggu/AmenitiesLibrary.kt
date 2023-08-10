package com.example.ggu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class AmenitiesLibrary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities_library)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val lib1btn =findViewById<Button>(R.id.library1)
        lib1btn.setOnClickListener {
            gotoUrl("http://164.100.113.105/library_staff/");
        }



        val lib2btn =findViewById<Button>(R.id.library2)
        lib2btn.setOnClickListener {
            gotoUrl("http://164.100.113.105/library_staff/");
        }
    }

    private fun gotoUrl(s: String) {
        val uri: Uri = Uri.parse(s)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }

    }
