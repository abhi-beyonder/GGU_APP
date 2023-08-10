package com.example.ggu.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.ggu.Cactivity
import com.example.ggu.R
import com.example.ggu.VCactivity

class HomeFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_home, container, false)



//        first image slider-------------------------------
        val imageSlider = view.findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://firebasestorage.googleapis.com/v0/b/android-app-ggu.appspot.com/o/College%20Images%2F02212023053438_VC_With_President1_22.8.22.jpg?alt=media&token=7105f0cd-5710-4530-a15b-689663475302"))
        imageList.add(SlideModel("https://www.ggu.ac.in/Admin/Files/SliderImg/11052021010516_7-Fit-India-Freedom-Run-2.0-1.jpg"))
        imageList.add(SlideModel("https://www.ggu.ac.in/Admin/Files/SliderImg/05042022125914_Womens-Day-Celebration-08.0.jpg"))
        imageList.add(SlideModel("https://www.ggu.ac.in/Admin/Files/SliderImg/04252022012350_VC-EC-AC-Deans-with-Governe.jpg"))
        imageList.add(SlideModel("https://www.ggu.ac.in/Admin/Files/SliderImg/09062022015617_Vice-President-with-bq-06.09.22.jpg"))
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
//        first image slider finish--------------------------------------------

//        second image slider starts-------------------------------------------------

        val imageSlider2 = view.findViewById<ImageSlider>(R.id.imageSlider2)
        val imageList2 = ArrayList<SlideModel>()
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/06272022044744_DSC_0246.jpg", "Address New Session"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/06272022044732_DSC_0240.jpg", "Address New Session"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/04252022032038_Convocation1%202022%2025.04.22.jpg", "9th Convocation"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/04252022032109_Convocation2%202022%2025.04.22.jpg", "9th Convocation"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/04252022032304_Convocation7%202022%2025.04.22.jpg", "9th Convocation"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/03152022015846_Gate%20Inaugural%20Ribbin%20Cutting.jpg", "GGV Gate Inaugural"))
        imageList2.add(SlideModel("https://ggu.ac.in/Admin/Files/Gallery/03152022015917_Gate%20Inaugural.jpg", "GGV Gate Inaugural"))
        imageSlider2.setImageList(imageList2, ScaleTypes.FIT)

//        second image slider ends------------------------------------------------


//        read more events---------------------------------------------------------

        val cbtn = view.findViewById<Button>(R.id.chancellorbutton)
        val vcbtn = view.findViewById<Button>(R.id.vcchancellorbutton)
        cbtn.setOnClickListener {
            val intent = Intent(context, Cactivity::class.java)
            context?.startActivity(intent)
        }
        vcbtn.setOnClickListener {
            val intent = Intent(context, VCactivity::class.java)
            context?.startActivity(intent)
        }

        var sam = view.findViewById<TextView>(R.id.sama)
        sam.setOnClickListener {
            gotoUrl("https://ggv.samarth.edu.in/index.php/site/login");
        }

        var ac = view.findViewById<TextView>(R.id.acad)
        ac.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/Academic_Calender.aspx");
        }

        var sw = view.findViewById<TextView>(R.id.swa)
        sw.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/Assets/PDF/SWAYAM-BOOKLET%2008.08.18.pdf");
        }

        var GO = view.findViewById<TextView>(R.id.GOI)
        GO.setOnClickListener {
            gotoUrl("https://www.india.gov.in/");
        }

        var CE = view.findViewById<TextView>(R.id.CEC)
        CE.setOnClickListener {
            gotoUrl("https://cec.nic.in/cec/");
        }

        var lh = view.findViewById<TextView>(R.id.list)
        lh.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/Assets/PDF/List%20of%20Holidays%20for%202023%2019.12.22.pdf");
        }

        var lv = view.findViewById<TextView>(R.id.leave)
        lv.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/Leave.aspx");
        }


        var df = view.findViewById<TextView>(R.id.dow)
        df.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/Leave.aspx");
        }
        var magazine=view.findViewById<ImageView>(R.id.mag)
        magazine.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/ggvmagazine.aspx");
        }
        var alm=view.findViewById<ImageView>(R.id.alumini)
        alm.setOnClickListener {
            gotoUrl("http://www.ggvalumni.in/");
        }

        var arc=view.findViewById<ImageView>(R.id.anti)
        arc.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/AntiRaggingCell.aspx");
        }

        var emp=view.findViewById<TextView>(R.id.employeebtn)
        emp.setOnClickListener {
            gotoUrl("https://www.ggu.ac.in/EmployeeSearch.aspx");
        }



        return view
    }

    private fun gotoUrl(s: String) {
        val uri: Uri = Uri.parse(s)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }


}