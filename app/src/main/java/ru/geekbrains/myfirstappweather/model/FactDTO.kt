package ru.geekbrains.myfirstappweather.model

data class FactDTO(
        val temp: Int?,
        val feels_like: Int?,
        val condition: String?,
        val pressure_mm: Int?,
        val humidity: Int?,
        val wind_speed: Int?,
        val wind_dir: String?
)
