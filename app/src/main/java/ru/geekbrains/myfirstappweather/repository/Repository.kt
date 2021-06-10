package ru.geekbrains.myfirstappweather.repository

import ru.geekbrains.myfirstappweather.model.Weather

interface Repository {
    fun getWeather(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}