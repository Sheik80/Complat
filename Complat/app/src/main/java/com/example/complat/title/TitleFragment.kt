package com.example.complat.title

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.complat.MainActivity
import com.example.complat.R
import com.example.complat.databinding.TitleFragmentBinding
import kotlinx.android.synthetic.main.title_fragment.*


class TitleFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment

       val binding: TitleFragmentBinding = DataBindingUtil.inflate(
            layoutInflater, R.layout.title_fragment, container, false)

             binding.tbo.setOnClickListener {view : View ->
            findNavController().navigate(R.id.action_titleFragment_to_tboFragment)
        }

        return binding.root
        }

    /*override fun onStart() {
        super.onStart()
        tbo.setOnClickListener {

            (activity as MainActivity).navController.navigate(R.id.action_titleFragment_to_tboFragment)
        }

    }*/
}