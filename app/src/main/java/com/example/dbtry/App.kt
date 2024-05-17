package com.example.dbtry

import android.app.Application
import com.example.dbtry.room.MainDB

class App: Application() {
    val database by lazy {MainDB.createDataBase(this)}
}