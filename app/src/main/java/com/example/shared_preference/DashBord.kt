package com.example.shared_preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shared_preference.databinding.ActivityDashBordBinding

class DashBord : AppCompatActivity() {
    lateinit var binding: ActivityDashBordBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashBordBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}