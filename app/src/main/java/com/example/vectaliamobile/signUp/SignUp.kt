package com.example.vectaliamobile.signUp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.vectaliamobile.R

class SignUp : Fragment(R.layout.signup_activity) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize EditText fields
        val nomField = view.findViewById<EditText>(R.id.signUpNom)
        val prenomField = view.findViewById<EditText>(R.id.signUpPrenom)
        val telField = view.findViewById<EditText>(R.id.signUpTel)
        val emailField = view.findViewById<EditText>(R.id.signUpEmail)
        val dateNaissanceField = view.findViewById<EditText>(R.id.signUpDateN)
        val AdresseField = view.findViewById<EditText>(R.id.signUpAdresse)
        val cneField = view.findViewById<EditText>(R.id.signUpCNE)
        val cniField = view.findViewById<EditText>(R.id.signUpCIN)
        val passwordField = view.findViewById<EditText>(R.id.signUpPassword)
        val verificationPasswordField = view.findViewById<EditText>(R.id.signUpPasswordVerification)

        // Sign-Up Button
        view.findViewById<Button>(R.id.signupButton).setOnClickListener {
            val nom = nomField.text.toString()
            val prenom = prenomField.text.toString()
            val tel = telField.text.toString()
            val email = emailField.text.toString()
            val dateNaissance = dateNaissanceField.text.toString()
            val ville = AdresseField.text.toString()
            val cne = cneField.text.toString()
            val cni = cniField.text.toString()
            val password = passwordField.text.toString()
            val verificationPassword = verificationPasswordField.text.toString()

            // Validate input
            if (password != verificationPassword) {
                Toast.makeText(requireContext(), "Les mots de passe ne correspondent pas", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Proceed with sign-up logic (e.g., API call)
            Toast.makeText(requireContext(), "Inscription réussie !", Toast.LENGTH_SHORT).show()
        }

        // Back to Login Button
        view.findViewById<Button>(R.id.switchToLoginButton).setOnClickListener {
            findNavController().navigate(R.id.action_signupFragment_to_loginFragment)
        }
    }
}

