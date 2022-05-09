package com.example.weatherapp.model
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "weather")
data class Weather(
    @PrimaryKey(autoGenerate = true)
    val Id: Int,
    val description: String,
    val temperature: String,
    val wind: String
)