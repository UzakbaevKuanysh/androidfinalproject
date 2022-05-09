package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.repository.WeatherRepository
import com.example.weatherapp.viewmodel.WeatherViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: WeatherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        viewModel.weatherResponse.observe(this, { weather ->

            binding.apply {
                tvCityName.text = "Almaty"
                tvDescription.text = weather.description
                tvTemperature.text = weather.temperature
                tvWind.text = weather.wind





            }

        })
    }
}