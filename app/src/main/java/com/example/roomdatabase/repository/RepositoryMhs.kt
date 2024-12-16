package com.example.roomdatabase.repository

import com.example.roomdatabase.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}