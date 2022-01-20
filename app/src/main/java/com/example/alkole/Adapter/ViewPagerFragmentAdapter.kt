package com.example.alkole

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerFragmentAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0-> LoginFragment()
            1-> RegisterFragment()
            2-> RecoverPasswordFragment()
            else -> LoginFragment()

        }

    }
}