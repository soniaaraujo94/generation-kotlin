package com.generation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.generation.fragment.databinding.FragmentFormBinding
import com.generation.fragment.fragment.DatePickerFragment
import com.generation.fragment.fragment.TimerPickerListener
import com.generation.fragment.model.Categoria
import java.time.LocalDate

class FormFragment : Fragment(), TimerPickerListener {

    private lateinit var binding: FragmentFormBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCategoria()

        mainViewModel.dataSelecionada.value = LocalDate.now()

        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
           response -> Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }

        binding.editData.setOnClickListener{
            DatePickerFragment(this).show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    fun spinnerCategoria(listCategoria: List<Categoria>?){
        if (listCategoria != null){
            binding.spinnerCategoria.adapter =
                ArrayAdapter(
                    requireContext(),
                    androidx.transition.R.layout.support_simple_spinner_dropdown_item,
                    listCategoria
                )
        }


    }

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date
    }
}
