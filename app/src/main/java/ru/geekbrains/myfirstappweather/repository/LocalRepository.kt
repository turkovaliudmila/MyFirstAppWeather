package ru.geekbrains.myfirstappweather.repository

import ru.geekbrains.myfirstappweather.model.Weather

interface LocalRepository {
    fun getAllHistory(): List<Weather>
    fun saveEntity(weather: Weather)
}