package ru.geekbrains.myfirstappweather.model

data class Wind(val speed: Int, val direction: Direction)

enum class Direction {
    NORTH,
    NORTH_WEST,
    NORTH_EAST,
    WEST,
    EAST,
    SOUTH,
    SOUTH_WEST,
    SOUTH_EAST,
    CALM
}
