package com.exemple.appcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.exemple.appcardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupCardView()
    }

    private fun setupCardView() {
        binding.cardView1.setOnClickListener {
            Toast.makeText(baseContext, "Clicked on Card 1", Toast.LENGTH_SHORT).show()
        }
    }
}