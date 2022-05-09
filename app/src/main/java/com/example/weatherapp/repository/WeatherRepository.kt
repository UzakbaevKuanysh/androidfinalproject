package com.example.weatherapp.repository



import com.example.weatherapp.api.ApiService

import dagger.Module

import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Inject

@Module
@DisableInstallInCheck

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getWeather() = apiService.getWeather()

    }



