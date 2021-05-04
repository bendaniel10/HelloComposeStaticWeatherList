package com.example.hellocompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _weatherForecasts = MutableLiveData<List<WeatherForecast>>()
    val weatherForecasts: LiveData<List<WeatherForecast>> = _weatherForecasts

    init {
        _weatherForecasts.value = DUMMY_WEATHER_FORECAST_VALUES
    }
}