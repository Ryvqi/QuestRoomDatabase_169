package com.example.roomdatabase.ui.viewmodel

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