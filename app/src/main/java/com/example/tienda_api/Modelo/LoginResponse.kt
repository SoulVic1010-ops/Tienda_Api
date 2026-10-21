package com.example.tienda_api.Modelo

import kotlinx.serialization.SerialName

data class LoginResponse(
    @SerialName("exito") val exito: Boolean = false,
    @SerialName("mensaje") val mensaje: String = "",
    @SerialName("idUsuario") val idUsuario: Int = 0,
    @SerialName("nombreUsuario") val nombreUsuario: String = "",
    @SerialName("nombreCliente") val nombreCliente: String = "",
    @SerialName("telefono") val telefono: String = ""
)
