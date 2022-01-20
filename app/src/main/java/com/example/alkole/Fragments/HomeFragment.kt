package com.example.alkole

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class HomeFragment : Fragment(R.layout.home_fragment){

    private lateinit var button2 : Button
    private lateinit var textView2: TextView
    private lateinit var button3 : Button
    private lateinit var textView3: TextView
    private lateinit var button4 : Button
    private lateinit var textView4: TextView
    private lateinit var button5 : Button
    private lateinit var textView5: TextView
    private lateinit var button6 : Button
    private lateinit var textView6: TextView
    private lateinit var button7 : Button
    private lateinit var textView7: TextView
    private lateinit var button8 : Button
    private lateinit var textView8: TextView
    private lateinit var button9 : Button
    private lateinit var textView9: TextView
    private lateinit var button10 : Button
    private lateinit var textView10: TextView
    private lateinit var button11 : Button
    private lateinit var textView11: TextView
    private lateinit var button12: Button
    private lateinit var textView12: TextView
    private lateinit var button13 : Button
    private lateinit var textView13: TextView
    private lateinit var button14 : Button
    private lateinit var textView14: TextView
    private lateinit var button15 : Button
    private lateinit var textView15: TextView
    private lateinit var button16 : Button
    private lateinit var textView16: TextView
    private lateinit var button17 : Button
    private lateinit var textView17: TextView
    private lateinit var button18 : Button
    private lateinit var textView18: TextView
    private lateinit var button19 : Button
    private lateinit var textView19: TextView
    private lateinit var button20 : Button
    private lateinit var textView20: TextView
    private lateinit var button21 : Button
    private lateinit var textView21: TextView



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button2= view.findViewById(R.id.button2)
        textView2= view.findViewById(R.id.textView2)
        button3= view.findViewById(R.id.button3)
        textView3= view.findViewById(R.id.textView3)
        button4= view.findViewById(R.id.button4)
        textView4= view.findViewById(R.id.textView4)
        button5= view.findViewById(R.id.button5)
        textView5= view.findViewById(R.id.textView5)
        button6= view.findViewById(R.id.button6)
        textView6= view.findViewById(R.id.textView6)
        button7= view.findViewById(R.id.button7)
        textView7= view.findViewById(R.id.textView7)
        button8= view.findViewById(R.id.button8)
        textView8= view.findViewById(R.id.textView8)
        button9= view.findViewById(R.id.button9)
        textView9= view.findViewById(R.id.textView9)
        button10= view.findViewById(R.id.button10)
        textView10= view.findViewById(R.id.textView10)
        button11= view.findViewById(R.id.button11)
        textView11= view.findViewById(R.id.textView11)
        button12= view.findViewById(R.id.button12)
        textView12= view.findViewById(R.id.textView12)
        button13= view.findViewById(R.id.button13)
        textView13= view.findViewById(R.id.textView13)
        button14= view.findViewById(R.id.button14)
        textView14= view.findViewById(R.id.textView14)
        button15= view.findViewById(R.id.button15)
        textView15= view.findViewById(R.id.textView15)
        button16= view.findViewById(R.id.button16)
        textView16= view.findViewById(R.id.textView16)
        button17= view.findViewById(R.id.button17)
        textView17= view.findViewById(R.id.textView17)
        button18= view.findViewById(R.id.button18)
        textView18= view.findViewById(R.id.textView18)
        button19= view.findViewById(R.id.button19)
        textView19= view.findViewById(R.id.textView19)
        button20= view.findViewById(R.id.button20)
        textView20= view.findViewById(R.id.textView20)
        button21= view.findViewById(R.id.button21)
        textView21= view.findViewById(R.id.textView21)

        val controller = Navigation.findNavController(view)

        button2.setOnClickListener {
            val amountText = textView2.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
                controller.navigate(action)

        }
        button3.setOnClickListener {
            val amountText = textView3.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button4.setOnClickListener {
            val amountText = textView4.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button5.setOnClickListener {
            val amountText = textView5.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button6.setOnClickListener {
            val amountText = textView6.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button7.setOnClickListener {
            val amountText = textView7.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button8.setOnClickListener {
            val amountText = textView8.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button9.setOnClickListener {
            val amountText = textView9.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button10.setOnClickListener {
            val amountText = textView10.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button11.setOnClickListener {
            val amountText = textView11.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button12.setOnClickListener {
            val amountText = textView12.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button13.setOnClickListener {
            val amountText = textView13.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }

        button14.setOnClickListener {
            val amountText = textView14.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button15.setOnClickListener {
            val amountText = textView15.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button16.setOnClickListener {
            val amountText = textView16.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button17.setOnClickListener {
            val amountText = textView17.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }

        button18.setOnClickListener {
            val amountText = textView18.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button19.setOnClickListener {
            val amountText = textView19.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button20.setOnClickListener {
            val amountText = textView20.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }
        button21.setOnClickListener {
            val amountText = textView21.text.toString()
            if (amountText.isEmpty())
                return@setOnClickListener
            val amount = amountText.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToCartFragment(amount)
            controller.navigate(action)

        }

    }
}