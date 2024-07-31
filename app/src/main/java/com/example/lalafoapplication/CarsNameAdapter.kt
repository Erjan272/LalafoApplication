package com.example.lalafoapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lalafoapplication.databinding.ItemCarBinding

class CarsNameAdapter(
    private val cars: List<String>,
    private val onClick: (String) -> Unit
) : RecyclerView.Adapter<CarsNameAdapter.CarViewHolder>() {

    inner class CarViewHolder(private val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(car: String) {
            binding.tvName.text = car
            binding.root.setOnClickListener {
                onClick(car)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        return CarViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.onBind(cars[position])
    }

    override fun getItemCount(): Int {
        return cars.size
    }
}
