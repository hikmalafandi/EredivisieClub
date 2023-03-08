package com.example.mysubmissionapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule

@GlideModule
class ListClubAdapter(private val listClub: ArrayList<Club>): RecyclerView.Adapter<ListClubAdapter.ListViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_club, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listClub.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listClub[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description
        holder.itemView.setOnClickListener {
            val moveToDetailIntent = Intent(holder.itemView.context, DetailClub::class.java)
            moveToDetailIntent.putExtra(DetailClub.EXTRA_NAME, name)
            moveToDetailIntent.putExtra(DetailClub.EXTRA_DESKRIPSI, description)
            moveToDetailIntent.putExtra(DetailClub.EXTRA_PHOTO, photo)
            holder.itemView.context.startActivity(moveToDetailIntent)
        }
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription : TextView = itemView.findViewById(R.id.tv_item_description)
    }


}


