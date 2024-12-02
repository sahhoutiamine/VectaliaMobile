package com.example.vectaliamobile.CLASSES

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
    private val listUsers = mutableListOf<User>()
    private val listAbonmont = mutableListOf<Abonmont>()
    private val listCard = mutableListOf<Card>()
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

}