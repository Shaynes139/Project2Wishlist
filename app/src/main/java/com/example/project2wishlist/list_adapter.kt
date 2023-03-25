package com.example.project2wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class list_adapter(private val wish:List<wishlist>): RecyclerView.Adapter<list_adapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val ItemEtTextView: TextView
        val PriceEtTextView: TextView
        val URLEtTextView: TextView

        init {
            ItemEtTextView = itemView.findViewById(R.id.ItemEt)
            PriceEtTextView = itemView.findViewById(R.id.PriceEt)
            URLEtTextView = itemView.findViewById(R.id.URLEt)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.activity_main, parent ,false)
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return wish.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val list = wish.get(position)
        holder.ItemEtTextView.text = list.ItemEt
        holder.PriceEtTextView.text = list.PriceEt
        holder.URLEtTextView.text = list.URLEt
    }
}
