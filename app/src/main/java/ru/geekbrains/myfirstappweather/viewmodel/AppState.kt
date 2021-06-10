package ru.geekbrains.myfirstappweather.viewmodel

import ru.geekbrains.myfirstappweather.model.Weather

sealed class AppState {
    data class Success(val weatherData: List<Weather>) : AppState()
    data class Error(val error: Throwable) : AppState()
    object Loading : AppState()
}
