package com.example.roomdatabase.dao

import androidx.room.Insert
import com.example.roomdatabase.entity.Mahasiswa

interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}