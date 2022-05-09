package com.example.weatherapp.di

import android.content.Context
import com.example.weatherapp.api.ApiService
import com.example.weatherapp.room.RoomDao
import com.example.weatherapp.room.WeatherDatabase
import com.example.weatherapp.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideBasUrl() = Constants.BASE_URL

    ///ProvideRetrofit = getretrofit
    //ApiiNTERFACE = aPISERVICE
    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL:String): ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)


}