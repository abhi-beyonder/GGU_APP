package com.example.ggu.ITDeptFragment

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ggu.MyAdapterNotice
import com.example.ggu.R
import com.google.android.material.imageview.ShapeableImageView
import org.w3c.dom.Text

class MyAdapterFacultyIT(private val facultyList : ArrayList<FacultyIT>): RecyclerView.Adapter<MyAdapterFacultyIT.MyViewHolder>() {

    private lateinit var mListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener : MyAdapterFacultyIT.onItemClickListener){
        mListener = listener
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.faculty_it_department_item ,
            parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = facultyList[position]
        holder.fitname.text = currentItem.faculty_it_name
        holder.fitdesignation.text = currentItem.faculty_it_designation
        holder.fitmob.text = currentItem.faculty_it_mob
        holder.fitemail.text = currentItem.faculty_it_email
        holder.fitimage.setImageResource(currentItem.faculty_it_image)


    }

    override fun getItemCount(): Int {
        return facultyList.size
    }

    class MyViewHolder(itemView : View, listener : MyAdapterFacultyIT.onItemClickListener) : RecyclerView.ViewHolder(itemView) {
        val fitname : TextView = itemView.findViewById(R.id.faculty_it_name)
        val fitdesignation : TextView = itemView.findViewById(R.id.faculty_it_designation)
        val fitmob : TextView = itemView.findViewById(R.id.faculty_it_mob)
        val fitemail : TextView = itemView.findViewById(R.id.faculty_it_email)
        val fitimage : ImageView = itemView.findViewById(R.id.facutly_it_image)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }
}