package com.example.ggu.ITDeptFragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.R

class MyAdapterNewsIT(private val newsList : ArrayList<NewsIT>): RecyclerView.Adapter<MyAdapterNewsIT.MyViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener : MyAdapterNewsIT.onItemClickListener){
        mListener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.faculty_it_news_item ,
            parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.newsittitle.text = currentItem.news_title
        holder.newsitdata.text = currentItem.news_data
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    class MyViewHolder(itemView : View, listener : MyAdapterNewsIT.onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        val newsittitle : TextView = itemView.findViewById(R.id.newsTitle)
        val newsitdata : TextView = itemView.findViewById(R.id.newsDate)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }


}