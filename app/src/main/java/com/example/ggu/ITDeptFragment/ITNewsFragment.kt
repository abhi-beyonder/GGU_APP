package com.example.ggu.ITDeptFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.R

class ITNewsFragment : Fragment() {

    private lateinit var adapter : MyAdapterNewsIT
    private lateinit var recyclerView: RecyclerView
    private lateinit var newsArrayList : ArrayList<NewsIT>
    lateinit var newsittitle : Array<String>
    lateinit var newsitdate : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_i_t_news, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_View)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapterNewsIT(newsArrayList)
        recyclerView.adapter = adapter

        val adaper = MyAdapterNewsIT(newsArrayList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapterNewsIT.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }


    private fun dataInitialize(){
        newsArrayList = arrayListOf<NewsIT>()

       newsittitle = arrayOf(
           "Restricted Holidays has been updated...", "Students has organised something go through it...",
           "Event occur in the mid sem and list has been given...",
           "there is change in exam time table refer this...", "TechFest is going to happen in march and april...",
           "Result has been declared. Check it out...", "There is minor change in academics go through pdf...",

           "Tender has been passed for construction of the event...", "Report has been published..."

       )
        newsitdate = arrayOf(
            "March 30, 2023","March 20, 2023","Feb. 22, 2023","Aprit 22, 2023","Feb. 22, 2023"
        )

        for( i in newsitdate.indices){
            val news = NewsIT(newsittitle[i], newsitdate[i])
            newsArrayList.add(news)
        }
    }

}