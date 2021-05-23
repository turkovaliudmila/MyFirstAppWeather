package ru.geekbrains.myfirstappweather.model

interface Repository {
    fun getWeather(): Weather
}