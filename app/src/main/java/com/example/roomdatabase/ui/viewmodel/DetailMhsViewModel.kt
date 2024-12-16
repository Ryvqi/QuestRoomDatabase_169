package com.example.roomdatabase.ui.viewmodel

import com.example.roomdatabase.data.entity.Mahasiswa

data class DetailUiState(
    val detailUiEvent: MahasiswaEvent = MahasiswaEvent(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = "",
){
    val isUiEmpty: Boolean
        get() = detailUiEvent == MahasiswaEvent()
    val isUiNotEmpty: Boolean
        get() = detailUiEvent != MahasiswaEvent()
}

//memindahkan data dari entity ke ui
fun Mahasiswa.toDetailUiEvent() : MahasiswaEvent{
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}