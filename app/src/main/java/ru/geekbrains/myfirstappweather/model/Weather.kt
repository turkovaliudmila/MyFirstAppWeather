package ru.geekbrains.myfirstappweather.model

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelsLike: Int = 0,
    val wind: Wind,
    val pressure: Int = 0,
    val humidity: Int = 0,
    val condition: Condition
)
