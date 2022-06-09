package com.generation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.findFragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.generation.fragment.adapter.TarefaAdapter
import com.generation.fragment.databinding.FragmentListBinding
import com.generation.fragment.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "lavar a louça o dia todo",
                "Sonia",
                "2022-06-07",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Ir ao parque",
                "Passear com os animais",
                "Sonia",
                "2022-06-07",
                false,
                "Lazer"
            ),
            Tarefa(
                "Ler um livro",
                "Psicologia das Cores",
                "Sonia",
                "2022-06-07",
                false,
                "Estudos"
            )
        )

        val tarefaAdapter = TarefaAdapter()

        binding.recyclerTarefa.adapter = tarefaAdapter
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.setHasFixedSize(true)

        tarefaAdapter.setList(listTarefas)

        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_listFragment_to_formFragment)
        }

        return binding.root
    }
}