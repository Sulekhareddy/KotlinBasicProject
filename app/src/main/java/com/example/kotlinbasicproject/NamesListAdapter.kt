package com.example.kotlinbasicproject

import android.graphics.ColorSpace
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class NamesListAdapter(val userList: ArrayList<Model>) : RecyclerView.Adapter<NamesListAdapter.NamesListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_recyclerview, parent,false)
        return NamesListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NamesListViewHolder, position: Int) {
        holder.name?.text = userList[position].name.toString()
        holder.age?.text = userList[position].age.toString()
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class NamesListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val name = itemView.findViewById<TextView>(R.id.name_text)
        val age = itemView.findViewById<TextView>(R.id.age_text)

    }
}