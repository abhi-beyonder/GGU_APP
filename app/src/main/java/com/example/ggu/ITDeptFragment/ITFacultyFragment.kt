package com.example.ggu.ITDeptFragment

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.MyAdapterNotice
import com.example.ggu.Notice
import com.example.ggu.R

class ITFacultyFragment : Fragment() {

    private lateinit var adapter : MyAdapterFacultyIT
    private lateinit var recyclerView: RecyclerView
    private lateinit var facultyArrayList : ArrayList<FacultyIT>
    lateinit var fitname : Array<String>
    lateinit var fitdesignatin : Array<String>
    lateinit var fitmob : Array<String>
    lateinit var fitemail : Array<String>
    lateinit var fitimage : Array<Int>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_i_t_faculty, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_View)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapterFacultyIT(facultyArrayList)
        recyclerView.adapter = adapter

        val adaper = MyAdapterFacultyIT(facultyArrayList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapterFacultyIT.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }
    private fun dataInitialize(){
        facultyArrayList = arrayListOf<FacultyIT>()

        fitname= arrayOf(
            "Dr. Rohit Raja","Dr. Rajesh Mahule", "Dr. Amit Kumar Khaskalam","Agnivesh Pandey","Dr. Santosh Soni","Abhishek Jain"
            ,"Pankaj Chandra","Deepak Kant Netam","Suhel Ahamed","Akanksha Gupta","Aradhana Soni","Amit Kumar Dewangan","Bindu Tiger"
        )

        fitdesignatin = arrayOf(
            "Associate Professor & HOD","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor"
            ,"Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor",
            "Assistant Professor","Assistant Professor (temporary)"
        )

        fitmob = arrayOf(
            "70005-59696","94252-30522","94252-80380","96912-85190" ,"88711-40312","89626-96827","99811-11983",
            "97554-46005","91656-78692","97701-47322","97555-10440","96911-68068","7000203310"
        )
        fitemail = arrayOf(
            "drrohitraja1982@gmail.com","rmahule@rediffmail.com","amitkumar.k@ggu.ac.in","agnitu1984@gmail.com","santoshsoni.77@gmail.com","ajain.nit@gmail.com"
            ,"pankaj2684@gmail.com","deepaknetam@gmail.com","suhel_starmail@yahoo.co.in","akanksha.me2011@gmail.com",
            "soni.aradhana@gmail.com","amit.nitrr@gmail.com","bindutiger.it@gmail.com"
        )
        fitimage = arrayOf(
            R.drawable.rohit, R.drawable.mahulesir, R.drawable.khaskalamsir, R.drawable.agniveshsir,R.drawable.santoshsir, R.drawable.jainsir,
            R.drawable.pankajsir, R.drawable.netamsir, R.drawable.sohalsir, R.drawable.akanshamam,
            R.drawable.aradhanamam, R.drawable.dewangansir, R.drawable.bindumam
        )


        for( i in fitname.indices){
            val faculties = FacultyIT(fitname[i], fitdesignatin[i], fitmob[i], fitemail[i], fitimage[i])
            facultyArrayList.add(faculties)
        }
    }


}