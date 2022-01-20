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

class RecoverPasswordFragment: Fragment(R.layout.recover_password_fragment) {
    private lateinit var editTextEmail: EditText
    private lateinit var buttonSendEmail: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextEmail = view.findViewById(R.id.editTextEmail2)
        buttonSendEmail = view.findViewById(R.id.buttonSendEmail)


        buttonSendEmail.setOnClickListener {
            val email = editTextEmail.text.toString()

            if(email.isEmpty()){
                Toast.makeText(getActivity(), "გთხოვთ შეიყვანოთ ელ-ფოსტა", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().sendPasswordResetEmail(email)
                .addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        Toast.makeText(getActivity(), "ლინკი გამოგზავნილია ელ-ფოსტაზე.", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this@RecoverPasswordFragment.requireContext(),
                            MainActivity::class.java)
                        startActivity(intent)
                        editTextEmail.text = null


                    }else{
                        Toast.makeText(getActivity(), "შეცდომა", Toast.LENGTH_SHORT).show()
                    }
                }

        }

    }
}
