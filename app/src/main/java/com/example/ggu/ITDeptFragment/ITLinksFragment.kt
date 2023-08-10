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

class ITLinksFragment : Fragment() {

    private lateinit var adapter : MyAdapterLinksIT
    private lateinit var recyclerView: RecyclerView
    private lateinit var linksArrayList : ArrayList<LinksIT>
    lateinit var linksittitle : Array<String>
    lateinit var linksitdate : Array<String>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_i_t_links, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.recycler_View)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = MyAdapterLinksIT(linksArrayList)
        recyclerView.adapter = adapter

        val adaper = MyAdapterLinksIT(linksArrayList)
        recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : MyAdapterLinksIT.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(context, "item clicked", Toast.LENGTH_SHORT).show()
            }
        })
    }


    private fun dataInitialize(){
        linksArrayList = arrayListOf<LinksIT>()

        linksittitle = arrayOf(
            "there is change in exam time table refer this...", "TechFest is going to happen in march and april...",
            "Result has been declared. Check it out...", "There is minor change in academics go through pdf...",
            "Restricted Holidays has been updated...", "Students has organised something go through it...",
            "Tender has been passed for construction of the event...", "Report has been published...",
            "Event occur in the mid sem and list has been given..."
        )
        linksitdate = arrayOf(
            "Feb. 22, 2023","Aprit 24, 2023","May 22, 2023","June 22, 2023","Feb. 22, 2023"
        )

        for( i in linksitdate.indices){
            val links = LinksIT(linksittitle[i], linksitdate[i])
            linksArrayList.add(links)
        }
    }

}