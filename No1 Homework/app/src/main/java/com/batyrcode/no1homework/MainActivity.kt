package com.batyrcode.no1homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batyrcode.no1homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var ans = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)


        val text1 = binding.editTextNumber.text
        val text2 = binding.editTextNumber2.text

        binding.buttonQosu.setOnClickListener {
            ans = (text1.toString().toInt() + text2.toString().toInt()).toString()

            binding.textView.text = ans
        }
        binding.buttonAzaitu.setOnClickListener {
            ans = (text1.toString().toInt() - text2.toString().toInt()).toString()

            binding.textView.text = ans
        }
        binding.buttonBolu.setOnClickListener {
            ans = (text1.toString().toInt() / text2.toString().toDouble()).toString()

            binding.textView.text = ans
        }
        binding.buttonKobeitu.setOnClickListener {
            ans = (text1.toString().toInt() * text2.toString().toInt()).toString()

            binding.textView.text = ans
        }
    }
}