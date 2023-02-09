package com.example.makanankhaspekalongan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val Data_Makananlist = listOf<Data_Makanan>(
            Data_Makanan(R.drawable.gambar_1,"Nasi Megono","hidangan khas Jawa Tengah yang terbuat dari potongan nangka muda dengan perpaduan kelapa parut yang dibumbui sehingga menciptakan rasa gurih. Megono awalnya berasal dari Kabupaten Pekalongan di pesisir utara Jawa"),
            Data_Makanan(R.drawable.gambar_2,"Tauto","soto dengan kaldu sapi atau kaldu ayam yang diolah bersama tauco. Orang luar Pekalongan sering kali menyebut hidangan ini sebagai soto pekalongan"),
            Data_Makanan(R.drawable.gambar_3,"Pindang Tetel","Makanan yang berasal dari Desa Ambokembang, Kecamatan Kedungwuni, Kabupaten Pekalongan ini pun memang dibuat dari tetelan daging sapi. Namun dalam perkembangannya tak hanya tetelan saja yang disajikan, tetapi juga daging dan juga jeroan"),
            Data_Makanan(R.drawable.gambar_4,"Garang Asem","masakan olahan ayam yang dimasak menggunakan daun pisang dan didominasi oleh rasa asam dan pedas"),
            Data_Makanan(R.drawable.gambar_5,"Lupis","makanan khas Indonesia terutama daerah Jawa. Ada dua bentuk lupis yang umum ditemui: segitiga atau bulat memanjang seperti lontong. Lupis dibuat dari beras ketan yang dimasak lalu dibungkus dengan daun pisang")
        )

        val recyclerView = findViewById<RecyclerView>(R.id.RV_makanan)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MakananAdapter(this,Data_Makananlist){
            val intent = Intent(this ,DetailMakanan::class.java)
            intent.putExtra(INTENT_PARCELABLE,it)
            startActivity(intent)

        }
    }
}








