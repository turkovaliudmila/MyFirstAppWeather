package ru.geekbrains.myfirstappweather.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Wind(val speed: Int, val direction: Direction) : Parcelable

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
