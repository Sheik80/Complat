package com.example.complat.tbo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.complat.MainActivity
import com.example.complat.R
import com.example.complat.databinding.TboFragmentBinding
import kotlinx.android.synthetic.main.tbo_fragment.*
import kotlinx.android.synthetic.main.title_fragment.*

class TboFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: TboFragmentBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.tbo_fragment, container,false
        )
        binding.backToTitle.setOnClickListener { view: View ->
            findNavController().navigate(R.id.action_tboFragment_to_titleFragment)

        }
        // Inflate the layout for this fragment
        return binding.root
    }


   /* override fun onStart() {
        super.onStart()
        backToTitle.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_tboFragment_to_titleFragment)
        }

    }*/
}