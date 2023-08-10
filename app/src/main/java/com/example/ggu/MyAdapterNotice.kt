package com.example.ggu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.fragment.NoticeFragment

class MyAdapterNotice(private val noticeList : ArrayList<Notice>): RecyclerView.Adapter<MyAdapterNotice.MyViewHolder>() {

        private lateinit var mListener : onItemClickListener

        interface onItemClickListener{
            fun onItemClick(position: Int)
        }

    fun setOnItemClickListener(listener : onItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,
        parent, false)
        return MyViewHolder(itemView, mListener)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = noticeList[position]
        holder.noticeinfo.text = currentItem.n_info
        holder.noticetime.text = currentItem.n_time
        holder.noticecause.text = currentItem.n_cause

    }

    override fun getItemCount(): Int {
        return noticeList.size
    }

    class MyViewHolder(itemView : View, listener : onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val noticeinfo : TextView = itemView.findViewById(R.id.noticeinfo)
        val noticetime : TextView = itemView.findViewById(R.id.notice_time)
        val noticecause : TextView = itemView.findViewById(R.id.notice_cause)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }

    }
}