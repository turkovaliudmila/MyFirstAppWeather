package ru.geekbrains.myfirstappweather.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.geekbrains.myfirstappweather.repository.Repository
import ru.geekbrains.myfirstappweather.repository.RepositoryImpl

class MainViewModel(private val liveDataToObserve: MutableLiveData<AppState> = MutableLiveData(),
                    private val repository: Repository = RepositoryImpl()) : ViewModel() {

    private val TIME_PAUSE: Long = 1000;

    fun getLiveData(): MutableLiveData<AppState> = liveDataToObserve

    fun getWeatherFromLocalSourceRus() = getDataFromLocalSource(true)

    fun getWeatherFromLocalSourceWorld() = getDataFromLocalSource(false)

    fun getWeatherFromRemoteSource() = getDataFromLocalSource(true)

    private fun getDataFromLocalSource(isRussian: Boolean) {
        liveDataToObserve.value = AppState.Loading
        Thread {
            Thread.sleep(this.TIME_PAUSE)
            liveDataToObserve.postValue(AppState.Success(if (isRussian) repository.getWeatherFromLocalStorageRus() else repository.getWeatherFromLocalStorageWorld()))
        }.start()
    }

}