package com.example.lalafoapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lalafoapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CarsNameAdapter
    private var cars: ArrayList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        setAdapter()
    }

    private fun setAdapter() {
        if (cars != null) {
            adapter = CarsNameAdapter(cars!!) { carName ->
                val customIntent = Intent(this, ContainerActivity::class.java)
                customIntent.putExtra("carName", carName)
                startActivity(customIntent)
            }
            binding.rvCar.adapter = adapter
        }
    }

    private fun initViews() {
        cars = ArrayList()
        cars?.apply {
            add("BMW")
            add("Mercedes")
            add("Toyota")
        }
    }
}
