package ru.geekbrains.myfirstappweather.model

data class City(val city: String, val lat: Double, val lon: Double)

fun getDefaultCity() = City("Moscow", 55.755826, 37.617299900000035)
