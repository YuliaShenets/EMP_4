package com.example.dbtry.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
data class NameEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val note: String
)