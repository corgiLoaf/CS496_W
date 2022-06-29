package com.example.helloworld

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworld.databinding.ItemListBinding

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var datalist = mutableListOf<Contacts>()

    inner class ViewHolder(private val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(contacts: Contacts) {
            binding.personName.text = contacts.name
            binding.personNumber.text = contacts.number
        }

    }

    // Create View Holder when there is no View Holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    // RecyclerView call this function when connect data from viewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datalist[position])
    }

}