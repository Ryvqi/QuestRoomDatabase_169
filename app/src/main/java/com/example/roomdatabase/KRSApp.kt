package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.dependenciesinjection.ContainerApp

class KRSApp : Application() {
    lateinit var containerApp: ContainerApp //Fungsinya untuk menyimpan

    override fun onCreate() {
        super.onCreate()
        containerApp = ContainerApp(this) // Membuat instace(pembuat object)
        //Instance adalah object yang dibuat dari class
    }
}