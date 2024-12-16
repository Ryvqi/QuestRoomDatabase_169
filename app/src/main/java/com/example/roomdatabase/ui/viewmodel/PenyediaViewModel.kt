package com.example.roomdatabase.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomdatabase.KRSApp
import com.example.roomdatabase.repository.LocalRepositoryMhs

object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                krsApp().containerApp.RepositoryMhs as LocalRepositoryMhs
            )
        }
    }
}

fun CreationExtras.krsApp(): KRSApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KRSApp)