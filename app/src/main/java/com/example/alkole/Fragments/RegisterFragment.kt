package com.example.alkole

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.google.firebase.auth.FirebaseAuth

class RegisterFragment: Fragment(R.layout.register_fragment) {

    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var editTextRepeatPassword: EditText
    private lateinit var buttonSubmit: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        editTextEmail = view.findViewById(R.id.editTextEmail)
        editTextPassword = view.findViewById(R.id.editTextPassword)
        editTextRepeatPassword = view.findViewById(R.id.editTextRepeatPassword)
        buttonSubmit = view.findViewById(R.id.buttonSubmit)


        buttonSubmit.setOnClickListener {

            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            val repeatpassword = editTextRepeatPassword.text.toString()

            if (email.isEmpty() || password.isEmpty() || repeatpassword.isEmpty()) {
                Toast.makeText(getActivity(), "გთხოვთ შეავსოთ ყველა ველი", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            }
            if (email.contains("@")) {
                if (password == repeatpassword) {
                    if (password.matches(".*[!@#$%^&*()].*".toRegex())){
                        if (password.length >= 8) {
                            if (password.matches(".*[0123456789].*".toRegex())) {

                                FirebaseAuth.getInstance()
                                    .createUserWithEmailAndPassword(email, password)
                                    .addOnCompleteListener { task ->
                                        if (task.isSuccessful) {
                                            Toast.makeText(
                                                getActivity(),
                                                "თქვენ წარმატებით დარეგისტრირდით!",
                                                Toast.LENGTH_LONG
                                            ).show()
                                            val intent = Intent(this@RegisterFragment.requireContext(),
                                                MainActivityProfile::class.java)
                                            startActivity(intent)
                                            editTextEmail.text = null
                                            editTextPassword.text = null
                                            editTextRepeatPassword.text = null


                                        } else {
                                            Toast.makeText(
                                                getActivity(),
                                                "შეცდომა! თავიდან სცადეთ.", Toast.LENGTH_SHORT
                                            ).show()
                                        }
                                    }
                            }else{
                                Toast.makeText(getActivity(), "პაროლი უნდა შეიცავდეს ციფრებს.", Toast.LENGTH_SHORT).show()
                            }
                        }else{
                            Toast.makeText(getActivity(),"პაროლი უნდა შეიცავდეს სულ მცირე 8 სიმბოლოს.", Toast.LENGTH_LONG).show()
                        }
                    }else{
                        Toast.makeText(getActivity(), "პაროლი უნდა შეიცავდეს სპეციალურ სიმბოლოებს.", Toast.LENGTH_LONG).show()
                    }
                } else{
                    Toast.makeText(getActivity(), "შეყვანილი პაროლები არ ემთხვევა.", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(getActivity(), "გთხოვთ შეიყვანოთ ვარგისი ელ-ფოსტა.", Toast.LENGTH_LONG).show()
            }

        }
    }



}