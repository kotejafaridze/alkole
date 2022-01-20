package com.example.alkole

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import androidx.fragment.app.Fragment
import com.example.alkole.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.UserInfo
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.util.Collections.list

class CartFragment : Fragment(R.layout.cart_fragment) {
    private lateinit var editTextAddress : EditText
    private lateinit var editTextPhone: EditText
    private lateinit var button : Button
    private lateinit var textView: TextView

    private val auth = FirebaseAuth.getInstance()
    private val db = FirebaseDatabase.getInstance().getReference("UserInfo")

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextAddress = view.findViewById(R.id.editTextAddress)
        editTextPhone = view.findViewById(R.id.editTextPhone)
        button = view.findViewById(R.id.button)
        textView = view.findViewById(R.id.textView)
        db.child(auth.currentUser?.uid!!).addValueEventListener(object:ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

            }

            override fun onCancelled(error: DatabaseError) {

            }

        })
        textView.text = CartFragmentArgs.fromBundle(requireArguments()).amount
        button.setOnClickListener {
            val address = editTextAddress.text.toString()
            val phone = editTextPhone.text.toString()
            val wineName = textView.text.toString()

            val userInfo = UserInfo(address,phone,wineName)
            if(!address.isEmpty() && phone.isDigitsOnly() && !phone.isEmpty() && !address.isDigitsOnly()) {
                if(wineName != "კალათში არაფერი მოიძებნება") {
                    if (phone.length == 9) {
                        db.child(auth.currentUser?.uid!!).setValue(userInfo)
                        Toast.makeText(
                            getActivity(),
                            "შეკვეთა წარმატებით დასრულდა, კურიერი მალე დაგიკავშირდებათ.",
                            Toast.LENGTH_SHORT).show()
                        editTextAddress.text = null
                        editTextPhone.text = null
                        textView.text = null
                        textView.text = "კალათში არაფერი მოიძებნება"


                    }else{
                        Toast.makeText(getActivity(), "გთხოვთ შეიყვანოთ სწორი ნომერი.", Toast.LENGTH_SHORT).show()
                    }
                }
                else{
                    Toast.makeText(getActivity(), "კალათი ცარიელია.", Toast.LENGTH_SHORT).show()
                }
            }else{
                Toast.makeText(getActivity(), "გთხოვთ შეიყვანოთ მისამართი ან ნომერი სწორად.", Toast.LENGTH_SHORT).show()
            }
        }



    }



}