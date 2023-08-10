package com.example.ggu.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.ggu.R

class AboutFragment : Fragment() {

    private lateinit var map : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about, container, false)

        var maps = view.findViewById<ImageView>(R.id.mapImage)
        maps.setOnClickListener {
            openMap()
        }

        return view
    }

    private fun openMap() {
        val uri : Uri = Uri.parse("geo:0, 0?q= Guru Ghasidas University Bilaspur")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        intent.setPackage("com.google.android.apps.maps")
        startActivity(intent)

    }


}