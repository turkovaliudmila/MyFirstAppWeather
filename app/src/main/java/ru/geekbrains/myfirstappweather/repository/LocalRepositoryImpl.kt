package ru.geekbrains.myfirstappweather.repository

import ru.geekbrains.myfirstappweather.model.Weather
import ru.geekbrains.myfirstappweather.room.HistoryDao
import ru.geekbrains.myfirstappweather.utils.*

class LocalRepositoryImpl(private val localDataSource: HistoryDao) : LocalRepository {
    override fun getAllHistory(): List<Weather> {
        return convertHistoryEntityToWeather(localDataSource.all())
    }

    override fun saveEntity(weather: Weather) {
        localDataSource.insert(convertWeatherToEntity(weather))
    }
}