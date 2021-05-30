package ru.geekbrains.myfirstappweather.model

interface Repository {
    fun getWeather(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}