package com.example.vectaliamobile.logIn

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vectaliamobile.CLASSES.MainClass
import com.example.vectaliamobile.MainActivity
import com.example.vectaliamobile.R
import com.example.vectaliamobile.activityMain
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LogIn : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.login_activity, container, false)

        val switchToSignUpButton: TextView = view.findViewById(R.id.switchToSignUpButton)
        switchToSignUpButton.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }

        val btn = view.findViewById<Button>(R.id.loginButton)
        val Email = view.findViewById<TextInputEditText>(R.id.loginEmail)
        val Pass = view.findViewById<TextInputEditText>(R.id.loginPassword)

        btn.setOnClickListener {
            val check = MainClass().recherch(Email.text.toString(), Pass.text.toString())

            if ( check != -1){
                val intent = Intent(requireContext(), activityMain::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(requireContext(), "Les mots de passe ne correspondent pas", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
