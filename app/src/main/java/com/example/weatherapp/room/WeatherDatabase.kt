package com.example.weatherapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.weatherapp.model.Weather

@Database(entities = [Weather::class], version = 1,exportSchema = false)

abstract class WeatherDatabase : RoomDatabase() {

    abstract fun getWeatherDao(): RoomDao
    companion object{
        private var INSTANCE : WeatherDatabase? = null

        fun getDatabase(context: Context): WeatherDatabase{

            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(
                    context,
                    WeatherDatabase::class.java,
                    "weatherDB"
                ).build()
            }
            return INSTANCE!!
        }
    }
}