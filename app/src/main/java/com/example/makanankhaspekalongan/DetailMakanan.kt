package com.example.makanankhaspekalongan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMakanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_makanan)

        val dataMakanan = intent.getParcelableExtra<Data_Makanan>(MainActivity.INTENT_PARCELABLE)

        val gmbr_makanan = findViewById<ImageView>(R.id.img_gambar)
        val nama_makanan = findViewById<TextView>(R.id.textmakanan)
        val nama_deskripsi= findViewById<TextView>(R.id.teksdescription)

        gmbr_makanan.setImageResource(dataMakanan?.gmbr_makanan!!)
        nama_makanan.text = dataMakanan.nama_makanan
        nama_deskripsi.text = dataMakanan.desc_makanan


    }
}