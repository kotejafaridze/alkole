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

class LoginFragment: Fragment(R.layout.login_fragment) {

    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonLogin: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editTextEmail = view.findViewById(R.id.editTextEmail)
        editTextPassword = view.findViewById(R.id.editTextPassword)
        buttonLogin = view.findViewById(R.id.buttonLogin)

        if (FirebaseAuth.getInstance().currentUser!= null){
            val intent = Intent(this@LoginFragment.requireContext(),
                MainActivityProfile::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener {

            val email = editTextEmail.text.toString()
            val password = editTextPassword.text.toString()
            if(email.isEmpty() || password.isEmpty()){

                Toast.makeText(getActivity(), "შეავსეთ ყველა გრაფა.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email,password)
                .addOnCompleteListener { task ->
                    if(task.isSuccessful){

                        val intent = Intent(this@LoginFragment.requireContext(),
                            MainActivityProfile::class.java)
                        startActivity(intent)
                    }else{
                        Toast.makeText(getActivity(), "შეცდომა", Toast.LENGTH_SHORT).show()
                    }
                    }
                }
        }



    }
}