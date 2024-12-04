package com.example.vectaliamobile.CLASSES

import com.example.vectaliamobile.CLASSES.data.listAbonmont
import com.example.vectaliamobile.CLASSES.data.listCard
import com.example.vectaliamobile.CLASSES.data.listUsers
import com.example.vectaliamobile.CLASSES.data.typeAbonmon
import com.example.vectaliamobile.CLASSES.info.Abonmont
import com.example.vectaliamobile.CLASSES.info.Card
import com.example.vectaliamobile.CLASSES.info.User
import kotlin.random.Random

fun generateRandomData(): String {
    val randomChar = ('A'..'Z').random()
    val randomIntegers = (1..9).joinToString("") { Random.nextInt(0, 10).toString() }
    return "$randomChar$randomIntegers"
}

class MainClass {
    fun addUsers( user: User){
        listUsers.add(user)
        val Abon = Abonmont(generateRandomData() , user.id , typeAbonmon.Scolaire)
        addAbonmont(Abon)
    }
    fun addAbonmont(Abon : Abonmont){
        listAbonmont.add(Abon)
        val card = Card(listCard.size , Abon.code , false)
        addCard(card)
    }
    fun addCard(card: Card){
      listCard.add(card)
    }
    fun recherch(Email : String , Password : String):Int{
        for ( i in listUsers){
            if (i.Email1 == Email && i.Password == Password){
                return i.id
            }
        }
        return -1
    }

}