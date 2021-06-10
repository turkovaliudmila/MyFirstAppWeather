package ru.geekbrains.myfirstappweather.repository

import ru.geekbrains.myfirstappweather.model.Weather
import ru.geekbrains.myfirstappweather.model.getRussianCities
import ru.geekbrains.myfirstappweather.model.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeather() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}