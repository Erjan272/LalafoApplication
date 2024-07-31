package com.example.lalafoapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lalafoapplication.databinding.ActivityContainerBinding

class ContainerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContainerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentData()
    }

    private fun getIntentData() {
        val carName = intent.getStringExtra("carName")
        val bundle = Bundle()
        bundle.putString("Key", carName)
        val fragment = DetailFragment()
        fragment.arguments = bundle
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
