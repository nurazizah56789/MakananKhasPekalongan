package com.example.makanankhaspekalongan

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.nio.file.Files.size


class MakananAdapter(private val context:Context,private val makanan:List<Data_Makanan>,val listener:(MakananAdapter)->Unit)
    : RecyclerView.Adapter<MakananAdapter.Data_MakananViewHolder>(){

    class Data_MakananViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val gmbr_makanan = view.findViewById<ImageView>(R.id.img_gambar)
        val nama_makanan = view.findViewById<TextView>(R.id.textmakanan)
        val desc_makanan = view.findViewById<TextView>(R.id.teksdescription)

        fun bindView(dataMakanan: Data_Makanan, listener: (MakananAdapter) -> Unit){
            gmbr_makanan.setImageResource(dataMakanan.gmbr_makanan)
            nama_makanan.text = dataMakanan.nama_makanan
            desc_makanan.text = dataMakanan.desc_makanan
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Data_MakananViewHolder {
        return Data_MakananViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_makanan, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Data_MakananViewHolder, position: Int) {
        holder.bindView(makanan[position], listener)
    }

    override fun getItemCount(): Int = makanan.size

}

