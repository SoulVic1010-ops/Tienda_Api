package com.example.tienda_api.Modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class dataCategorias(
    @SerialName(value = "id") val id: Int = 0,
    @SerialName(value = "categoria") val categoria: String = ""
)
{
    override fun toString(): String {
        return categoria
    }
}