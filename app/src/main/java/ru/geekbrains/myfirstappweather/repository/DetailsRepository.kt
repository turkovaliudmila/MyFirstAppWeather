package ru.geekbrains.myfirstappweather.repository

import ru.geekbrains.myfirstappweather.model.WeatherDTO

interface DetailsRepository {
    fun getWeatherDetailsFromServer(lat: Double, lon: Double, callback: retrofit2.Callback<WeatherDTO>)
}