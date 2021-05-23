package ru.geekbrains.myfirstappweather.model

sealed class Condition

object clear : Condition()

data class cloudy(val level: Int) : Condition()

data class rain(val level: Int) : Condition()

data class snow(val level: Int) : Condition()

object hail : Condition()

object thunderstorm : Condition()


