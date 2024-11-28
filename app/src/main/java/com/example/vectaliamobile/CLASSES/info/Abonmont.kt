package com.example.vectaliamobile.CLASSES.info

import com.example.vectaliamobile.CLASSES.data.typeAbonmon
import java.sql.Date
import java.util.Calendar

class Abonmont(
    val code: Int,
    val idUser: Int,
    val tayb: typeAbonmon,
    val dateCreation: Date,
    val dateTermin: Date
) {
    constructor(code: Int, idUser: Int, tayb: typeAbonmon) : this(
        code,
        idUser,
        tayb,
        Date(System.currentTimeMillis()),
        calculateEndDate()
    )

    companion object {
        private fun calculateEndDate(): Date {
            val calendar = Calendar.getInstance()
            calendar.time = java.util.Date()
            calendar.add(Calendar.YEAR, 1)
            return Date(calendar.time.time)
        }
    }
}
