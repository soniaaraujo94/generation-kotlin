package com.generation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.generation.fragment.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }

        return binding.root
    }
}