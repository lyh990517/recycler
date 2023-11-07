package com.example

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.xmltest.databinding.ItemTestBinding


class TestAdapter : RecyclerView.Adapter<TestAdapter.ViewHolder>() {
    private var list = listOf<String>()

    inner class ViewHolder(private val binding: ItemTestBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(string: String) {
            binding.title.text = string
        }
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemTestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    fun setList(list: List<String>){
        this.list = list
        notifyDataSetChanged()
    }
}