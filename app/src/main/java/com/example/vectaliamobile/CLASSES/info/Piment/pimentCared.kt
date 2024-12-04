package com.example.vectaliamobile.CLASSES.info.Piment

import android.media.Image
import java.util.Date

class pimentCared
    (
    idPiment : Int,
    DatePiment : Date,
    IdCaret : Int,
    val Img : Image,
    masterKared : String,
    CVV : String,
    dateTermine : String
):piment(idPiment , DatePiment , IdCaret){
}