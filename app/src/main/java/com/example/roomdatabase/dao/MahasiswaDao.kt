package com.example.roomdatabase.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.roomdatabase.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    @Query ("SELECT * FROM mahasiswa WHERE nim = :nim")
    fun getMahasiswa(nim : String): Flow<Mahasiswa>

    @Delete
    suspend fun deleteMahasiswa (mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)
}