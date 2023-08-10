package com.example.ggu.ITDeptFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.R

class MyAdapterLinksIT (private val linksList : ArrayList<LinksIT>): RecyclerView.Adapter<MyAdapterLinksIT.MyViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener : MyAdapterLinksIT.onItemClickListener){
        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.it_links_item ,
            parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = linksList[position]
        holder.linksittitle.text = currentItem.links_title
        holder.linksitdata.text = currentItem.links_date
    }

    override fun getItemCount(): Int {
        return linksList.size
    }

    class MyViewHolder(itemView : View, listener : MyAdapterLinksIT.onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        val linksittitle : TextView = itemView.findViewById(R.id.linksTitle)
        val linksitdata : TextView = itemView.findViewById(R.id.linksDate)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }


}