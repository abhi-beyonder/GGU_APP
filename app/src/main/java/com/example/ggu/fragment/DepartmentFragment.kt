package com.example.ggu.fragment

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.example.ggu.R
import com.example.ggu.informationtechnology

class DepartmentFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_department, container, false)

        val spinId2 = view.findViewById<Spinner>(R.id.spinnerID2)
        val engineering = arrayOf("Select Department", "Information Technology", "Computer Science", "Electronics And Communication", "Mechanical Engineering", "Chemical Engineering",
        "Civil Engineering", "Industrial And Production Engineering")
        val arrayAdp = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, engineering)
        spinId2.adapter = arrayAdp
        spinId2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
                if(position == 1){
                    val intent = Intent(context, informationtechnology::class.java)
                    context?.startActivity(intent)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinid3= view.findViewById<Spinner>(R.id.spinnerID3)
        val lifeScience = arrayOf("Select Department", "Botany", "Zoology", "Anthropology and Tribal Development")
        val arrayAdpLS = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, lifeScience)
        spinid3.adapter = arrayAdpLS
        spinid3.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinid4= view.findViewById<Spinner>(R.id.spinnerID4)
        val socialScience = arrayOf("Select Department", "Economics", "History", "Social Work", "Political Science And Public Administration")
        val arrayAdpSS = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, socialScience)
        spinid4.adapter = arrayAdpSS
        spinid4.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinid7= view.findViewById<Spinner>(R.id.spinnerID7)
        val physicalscience = arrayOf("Select Department", "Chemistry", "Pure And Applied Physics")
        val arrayAdpPS = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, physicalscience)
        spinid7.adapter = arrayAdpPS
        spinid7.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinid9= view.findViewById<Spinner>(R.id.spinnerID9)
        val law = arrayOf("Select Department", "Law")
        val arrayAdpLaw = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, law)
        spinid9.adapter = arrayAdpLaw
        spinid9.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId6 = view.findViewById<Spinner>(R.id.spinnerID6)
        val NaturalResources = arrayOf("Select Department", "Forestry,Wildlife & Environmental Science", "Pharmacy")
        val arrayAdp6 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, NaturalResources)
        spinId6.adapter = arrayAdp6
        spinId6.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId5 = view.findViewById<Spinner>(R.id.spinnerID5)
        val mandc = arrayOf("Select Department", "Computer Science And Information Technology", "Mathematics")
        val arrayAdp5 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, mandc)
        spinId5.adapter = arrayAdp5
        spinId5.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId1 = view.findViewById<Spinner>(R.id.spinnerID1)
        val arts = arrayOf("Select Department", "English and Foreign Language", "Hindi","Journalism And Mass Communication","Library And Information Science")
        val arrayAdp1 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, arts)
        spinId1.adapter = arrayAdp1
        spinId1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId8 = view.findViewById<Spinner>(R.id.spinnerID8)
        val commerceandm = arrayOf("Select Department", "Commerce", "Management Studies")
        val arrayAdp8 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, commerceandm)
        spinId8.adapter = arrayAdp8
        spinId8.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId10 = view.findViewById<Spinner>(R.id.spinnerID10)
        val education= arrayOf("Select Department", "Education","Physical Education")
        val arrayAdp10 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, education)
        spinId10.adapter = arrayAdp10
        spinId10.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        val spinId11 = view.findViewById<Spinner>(R.id.spinnerID11)
        val interdisciplininary = arrayOf("Select Department", "Biotechnology","Forensic Science","Rular Technology")
        val arrayAdp11 = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, interdisciplininary)
        spinId11.adapter = arrayAdp11
        spinId11.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position==0){
                    (view as TextView).setTextColor(Color.GRAY)
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }




        return view
    }

}