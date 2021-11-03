package com.example.androidassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidassignment.databinding.ItemRepositoryListBinding

class RepositoryAdapter : RecyclerView.Adapter<RepositoryAdapter.RepositoryViewHolder>() {

    val RepositoryList = mutableListOf<RepositoryData>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RepositoryViewHolder {
        val binding = ItemRepositoryListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.onBind(RepositoryList[position])
    }

    override fun getItemCount(): Int = RepositoryList.size

    class RepositoryViewHolder(private val binding: ItemRepositoryListBinding)
        : RecyclerView.ViewHolder(binding.root) {
        fun onBind(data : RepositoryData) {
            binding.tvTitle.text = data.title
            binding.tvContent.text = data.content
        }
    }
}