package com.ladisa.project_kotlin_mobileapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.salti.project_kotlin_mobileapp.R
import com.ladisa.project_kotlin_mobileapp.model.ModelBuah
import android.view.View

class BuahAdapter (val itemList: ArrayList<ModelBuah>)
    : RecyclerView.Adapter<BuahAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //deklarasi widget dari item layout
        var itemImage: ImageView
        var itemText: TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //kita deklare layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_custom_buah, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)
    }
}