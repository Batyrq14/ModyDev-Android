package com.batyrcode.no2homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batyrcode.no2homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonChange.setOnClickListener {
            binding.imageView2.setImageResource(R.drawable.iamrich_02)
        }
    }
}