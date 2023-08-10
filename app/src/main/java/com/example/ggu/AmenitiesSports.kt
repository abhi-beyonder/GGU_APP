package com.example.ggu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class AmenitiesSports : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amenities_sports)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val view = (R.layout.activity_amenities_sports)
        val imageSlider4 = findViewById<ImageSlider>(R.id.imageSlider4)
        val imageList4 = ArrayList<SlideModel>()
        imageList4.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/Basketball%20Court_25.4.22.jpg","Basketball"))
        imageList4.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/Cricket%20Ground_25.4.22.jpg","Cricket"))
        imageList4.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/Volleyball%20Court_25.4.22.jpg","Voleyball"))
        imageList4.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/Kabaddi%20Court_25.4.22.jpg","Kabaddi"))
        imageList4.add(SlideModel("https://www.ggu.ac.in/Assets/images/Pages/8.BADMINTON%20MATCH%20WITH%20HVC%20SIR%20TEAM_25.4.22.jpg","Badminton"))
        imageSlider4.setImageList(imageList4, ScaleTypes.FIT)
    }
}