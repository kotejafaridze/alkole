package com.example.alkole

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.alkole.R

import com.google.firebase.auth.FirebaseAuth

class ChangePasswordFragment: Fragment(R.layout.change_password_fragment) {

    private lateinit var editTextNewPassword: EditText
    private lateinit var editTextConfirmpass: EditText
    private lateinit var buttonChangePassword: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        editTextNewPassword = view.findViewById(R.id.editTextNewPassword)
        buttonChangePassword = view.findViewById(R.id.buttonChangePassword)
        editTextConfirmpass = view.findViewById(R.id.editTextConfirmPass)
        val controller = Navigation.findNavController(view)
        buttonChangePassword.setOnClickListener {

            val password1 = editTextNewPassword.text.toString()
            val confirmpass1 =  editTextConfirmpass .text.toString()



            if ( password1.isEmpty() || confirmpass1.isEmpty()) {
                Toast.makeText(getActivity(), "გთხოვთ შეავსოთ ყველა გრაფა", Toast.LENGTH_LONG)
                    .show()
                return@setOnClickListener
            }
            if (password1 == confirmpass1) {
                if(password1.matches(".*[!@#$%^&*()].*".toRegex())){
                    if (password1.length >= 8) {
                        if (password1.matches(".*[0123456789].*".toRegex())) {
                            FirebaseAuth.getInstance()?.currentUser?.updatePassword(password1)
                                ?.addOnCompleteListener { task ->
                                    if (task.isSuccessful) {
                                        Toast.makeText(
                                            getActivity(),
                                            "პაროლი წარმატებით შეიცვალა.",
                                            Toast.LENGTH_LONG
                                        ).show()
                                        val action13 = ChangePasswordFragmentDirections.actionChangePasswordFragmentToProfileFragment()
                                        controller.navigate(action13)
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
                Toast.makeText(getActivity(), "შეყვანილი პაროლები არ ემთხვევა.", Toast.LENGTH_LONG).show() }

        }




    }
}