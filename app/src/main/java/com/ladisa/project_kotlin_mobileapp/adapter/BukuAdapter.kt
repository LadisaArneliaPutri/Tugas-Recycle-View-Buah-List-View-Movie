package com.ladisa.project_kotlin_mobileapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.salti.project_kotlin_mobileapp.R
import com.ladisa.project_kotlin_mobileapp.model.ModelBuku

class BukuAdapter (private val buku: List<ModelBuku>) :
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>() {

    //view holder yang nanti gunakan untuk menyimpan referensi widget item layout
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view) {
        val txtJudul: TextView = view.findViewById(R.id.txtJudul)
        val txtPenulis: TextView = view.findViewById(R.id.txtPenulis)
    }

    class MyViewHolder {

    }

    //untuk layout recycle
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycle_view, parent, false)
        return BukuAdapterHolder(view)
    }

    //diatur untuk pengaturan data item pada setiap list dari recycle view
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {
        holder.txtJudul.text = buku[position].judul
        holder.txtPenulis.text = buku[position].penulis
    }

    override fun getItemCount(): Int {
        return buku.size
    }
}
