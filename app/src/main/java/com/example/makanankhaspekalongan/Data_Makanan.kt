package com.example.makanankhaspekalongan

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Data_Makanan(val gmbr_makanan:Int,val nama_makanan:String,val desc_makanan:String
):Parcelable
