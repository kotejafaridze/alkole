package com.example.alkole

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.google.firebase.auth.FirebaseAuth

class ProfileFragment: Fragment(R.layout.profile_fragment) {

    private lateinit var buttonLogout: Button
    private lateinit var buttonChangePassword1: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = Navigation.findNavController(view)
        buttonLogout = view.findViewById(R.id.buttonLogout)
        buttonChangePassword1 = view.findViewById(R.id.buttonChangePassword1)

        buttonLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val intent = Intent(this@ProfileFragment.requireContext(),
                MainActivity::class.java)
            startActivity(intent)

        }
        buttonChangePassword1.setOnClickListener {
            val action12 = ProfileFragmentDirections.actionProfileFragmentToChangePasswordFragment()
            controller.navigate(action12)
        }



    }
}