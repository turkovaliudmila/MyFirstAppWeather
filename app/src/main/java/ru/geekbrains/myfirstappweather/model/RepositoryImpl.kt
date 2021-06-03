package ru.geekbrains.myfirstappweather.model

class RepositoryImpl : Repository {
    override fun getWeather() = Weather()

    override fun getWeatherFromLocalStorageRus() = getRussianCities()

    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}