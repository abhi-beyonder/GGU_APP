package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class AmenitiesCafeteria : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities_cafeteria)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val view = (R.layout.activity_amenities_cafeteria)
        val imageSlider3 = findViewById<ImageSlider>(R.id.imageSlider3)
        val imageList3 = ArrayList<SlideModel>()
        imageList3.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/cafeteria2.jpg"))
        imageList3.add(SlideModel(R.drawable.cafe2))
        imageList3.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/cafeteria1.jpg"))
        imageSlider3.setImageList(imageList3, ScaleTypes.FIT)
    }
}