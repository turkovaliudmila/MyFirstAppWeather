package ru.geekbrains.myfirstappweather.model

class RepositoryImpl : Repository {
    override fun getWeather(): Weather {
        return Weather()
    }
}