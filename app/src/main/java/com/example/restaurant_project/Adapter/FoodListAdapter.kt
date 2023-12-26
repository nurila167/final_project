package com.example.restaurant_project.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.restaurant_project.Menu
import com.example.restaurant_project.databinding.FoodItemBinding

class FoodListAdapter(
    private val items: List<Menu>
): RecyclerView.Adapter<FoodListAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(
            FoodItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bindView(items[position])
    }


    class FoodViewHolder(private val binding: FoodItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bindView(item: Menu){
            Glide.with(binding.root)
                .load(item.url)
                .into(binding.homeFoodImage)
        }
    }
}