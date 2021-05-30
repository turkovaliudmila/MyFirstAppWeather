package ru.geekbrains.myfirstappweather.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(val city: String, val lat: Double, val lon: Double) : Parcelable

fun getDefaultCity() = City("Moscow", 55.755826, 37.617299900000035)
