package com.generation.fragment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.generation.fragment.databinding.CardLayoutBinding
import com.generation.fragment.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>() {

    var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLayoutBinding): RecyclerView.ViewHolder(binding.root){    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
       return TarefaViewHolder(CardLayoutBinding.inflate
           (LayoutInflater.from(parent.context), parent, false
       ))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]

        holder.binding.textNome.text = tarefa.nome
        holder.binding.textDescricao.text = tarefa.descricao
        holder.binding.textResponsavel.text = tarefa.responsavel
        holder.binding.textData.text = tarefa.data
        holder.binding.switchndamento.isChecked = tarefa.status
        holder.binding.textCategoria.text = tarefa.categoria

    }

    override fun getItemCount(): Int {
        return listTarefa.size
    }

    fun setList(list: List<Tarefa>){
        listTarefa = list
        notifyDataSetChanged()

    }
}