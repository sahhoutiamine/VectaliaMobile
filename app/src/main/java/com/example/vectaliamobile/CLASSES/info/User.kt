package com.example.vectaliamobile.CLASSES.info



fun isValid(string: String , patern:String): Boolean {
    val regex = Regex(patern)
    return regex.matches(string)
}



    class User(
        val id: Int,
        private val nom: String,
        private val prenom: String,
        private val Tel: String,
        private val DateNaissanse: String,
        private val adresse: String,
        private  val CIN: String,
        private  val CNE: String,
        private var Email : String,
        private var Password : String
    ) {
        init {
            if (!isValid(CIN,"^[A-Z]{2}\\d{6}$")) {
                throw IllegalArgumentException("Verifiez le CIN")
            } else if (!isValid(Tel,"^+212 \\d{9}$")) {
                throw IllegalArgumentException("Verifiez le Telephone")
            } else if (!isValid(DateNaissanse , "^\\d{2}/\\d{2}/\\d{4}$")) {
                throw IllegalArgumentException("Verifiez le Dtat Naissanse")
            }else if (!isValid(Email , "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
                throw IllegalArgumentException("Verifiez le Email")
            }else if (Password.length < 8){
                throw IllegalArgumentException("Verifiez le Password")
            }else if (!isValid(CNE , "^[A-Z]\\d{9}$")){
                throw IllegalArgumentException("Verifiez le CNE")
            }
        }
        fun setEmail(NewEmail: String){
            if (!isValid(Email , "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
            {
                Email = NewEmail
            }
            else
            {
                throw IllegalArgumentException("Verifiez le Email")
            }
        }
        fun SetPassword(NewPassword: String)
        {
            if (NewPassword.length >= 8){
                Password = NewPassword
            }
            else
            {
                throw IllegalArgumentException("Verifiez le Password")
            }
        }

    }
