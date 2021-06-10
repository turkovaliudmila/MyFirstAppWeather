package ru.geekbrains.myfirstappweather.utils

import ru.geekbrains.myfirstappweather.model.FactDTO
import ru.geekbrains.myfirstappweather.model.Weather
import ru.geekbrains.myfirstappweather.model.WeatherDTO
import ru.geekbrains.myfirstappweather.model.getDefaultCity

fun convertDtoToModel(weatherDTO: WeatherDTO): List<Weather> {
    val fact: FactDTO = weatherDTO.fact!!
    return listOf(Weather(getDefaultCity(), fact.temp!!, fact.feels_like!!, fact.pressure_mm!!, fact.humidity!!, fact.condition!!))
}