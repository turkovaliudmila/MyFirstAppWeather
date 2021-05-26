package ru.geekbrains.myfirstappweather.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.myfirstappweather.model.AppState
import ru.geekbrains.myfirstappweather.model.Repository
import ru.geekbrains.myfirstappweather.model.RepositoryImpl

class MainViewModel(private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
                    private val repository: Repository = RepositoryImpl()) : ViewModel() {

    fun getLiveData() = liveDataToObserve

    fun getWeather() = getDataAboutWeather()

    private fun getDataAboutWeather() {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(1000)
            liveDataToObserve.postValue(AppState.Success(repository.getWeather()))
        }.start()
    }
}