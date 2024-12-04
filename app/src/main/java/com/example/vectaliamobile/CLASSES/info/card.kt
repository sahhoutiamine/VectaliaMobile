package com.example.vectaliamobile.CLASSES.info

import android.os.Build
import androidx.annotation.RequiresApi
import com.example.vectaliamobile.CLASSES.info.Piment.piment_Rib
import java.time.LocalDate
import java.util.Date

class Card(
    val id: Int,
    val code: String,
    var disponible: Boolean
) {
    val listPiment = mutableListOf<piment_Rib>()
    var active: Boolean = false
    var tcheck = false
    fun isActive(){
        val thisDate = Date()

        if (tcheck){
            active = true
        }
    }
}
