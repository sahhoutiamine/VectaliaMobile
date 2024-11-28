package com.example.vectaliamobile.CLASSES.info

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

class Card(
    val id: Int,
    var active: Boolean,
    val code: Int,
    var disponible: Boolean
) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun updateActiveStatus(date: LocalDate) {
        val currentMonth = LocalDate.now().month
        val inputMonth = date.month

        active = (currentMonth == inputMonth)
    }

}
