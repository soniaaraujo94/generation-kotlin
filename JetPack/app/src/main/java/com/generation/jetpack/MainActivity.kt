package com.generation.jetpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.generation.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel = ViewModelProvider(this)
            .get(MainViewModel::class.java)

        mainViewModel.cont.observe(this){
            binding.count.text = it.toString()
        }

        binding.button.setOnClickListener{
            mainViewModel.addNum()

        }

    }
}