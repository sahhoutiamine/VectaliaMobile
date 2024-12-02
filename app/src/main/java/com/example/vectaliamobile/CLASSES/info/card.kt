package com.example.vectaliamobile.CLASSES.info

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.vectaliamobile.CLASSES.info.Piment.piment
import com.example.vectaliamobile.CLASSES.info.Piment.piment_Rib
import java.time.LocalDate
import java.util.Date

class Card(
    val id: Int,
    val code: String,
    var disponible: Boolean
) {
    val listPiment = mutableListOf<piment>()
    var active: Boolean = false
    var tcheck = false
    fun isActive(){
        val thisDate = Date()
        for ( i in listPiment){
            if (thisDate.month == i.DatePiment.month ){
               tcheck = true
            }
        }
        if (tcheck){
            active = true
        }
    }
}
