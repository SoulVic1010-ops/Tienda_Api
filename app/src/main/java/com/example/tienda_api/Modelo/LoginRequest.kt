package com.example.tienda_api.Modelo

import kotlinx.serialization.SerialName

data class LoginRequest(
    @SerialName("nombreUsuario") val nombreUsuario: String = "",
    @SerialName("passusuario") val passusuario: String = ""
)
