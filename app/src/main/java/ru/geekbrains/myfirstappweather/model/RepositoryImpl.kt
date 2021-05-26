package ru.geekbrains.myfirstappweather.model

class RepositoryImpl : Repository {
    override fun getWeather(): Weather {
        return Weather()
    }
    override fun getWeatherFromLocalStorageRus(): List<Weather> {
        return getRussianCities()
    }
    override fun getWeatherFromLocalStorageWorld(): List<Weather> {
        return getWorldCities()
    }
}