package ru.geekbrains.myfirstappweather.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Update

@Database(entities = arrayOf(HistoryEntity::class), version = 1, exportSchema = false)
abstract class HistoryDataBase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}