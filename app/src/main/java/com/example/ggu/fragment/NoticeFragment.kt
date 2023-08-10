package com.example.ggu.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.MyAdapterNotice
import com.example.ggu.Notice
import com.example.ggu.R

class NoticeFragment : Fragment() {

    private lateinit var adapter: MyAdapterNotice
    private lateinit var recyclerView : RecyclerView
    private lateinit var noticeArrayList: ArrayList<Notice>
    lateinit var ntinfo : Array<String>
    lateinit var nttime : Array<String>
    lateinit var ntcause : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_notice, container, false)



        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_View)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapterNotice(noticeArrayList)
        recyclerView.adapter = adapter

        val adaper = MyAdapterNotice(noticeArrayList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapterNotice.onItemClickListener{
            override fun onItemClick(position: Int) {
                if(position ==0){
                    gotoUrl("https://firebasestorage.googleapis.com/v0/b/android-app-ggu.appspot.com/o/Notices%2F04202023034315_1.%20advertizemnt%20-%20English%2020.04.23.pdf?alt=media&token=0dd7dfda-181e-4257-9324-5c448237ab67")
                }
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }

    private fun dataInitialize(){
        noticeArrayList = arrayListOf<Notice>()

        ntinfo= arrayOf(
            "there is change in exam time table refer this...", "TechFest is going to happen in march and april...",
            "Result has been declared. Check it out...", "There is minor change in academics go through pdf...",
            "Restricted Holidays has been updated...", "Students has organised something go through it...",
            "Tender has been passed for construction of the event...", "Report has been published...",
            "Event occur in the mid sem and list has been given..."
        )

        nttime = arrayOf(
            "30 march 2023 9:30 PM", "30 march 2023 9:30 PM", "30 march 2023 9:30 PM", "30 march 2023 9:30 PM", "30 march 2023 9:30 PM", "30 march 2023 9:30 PM",
            "30 march 2023 9:30 PM", "30 march 2023 9:30 PM", "30 march 2023 9:30 PM"
        )

        ntcause = arrayOf(
            "Exam Time Table",  "E-Notice Borad", "Result", "Academics", "Holidays", "Student Activities", "Tender/EOI", "Annual Account and Report", "University Events"
        )

        for( i in ntinfo.indices){
            val notices = Notice(ntinfo[i], nttime[i], ntcause[i])
            noticeArrayList.add(notices)
        }
    }

    private fun gotoUrl(s: String) {
        val uri: Uri = Uri.parse(s)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }


}