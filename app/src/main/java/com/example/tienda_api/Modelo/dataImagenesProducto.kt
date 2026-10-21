package com.example.tienda_api.Modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class dataImagenesProducto(
    @SerialName(value = "id") val id: Int = 0,
    @SerialName(value = "producto_id") val productoId: Int = 0,
    @SerialName(value = "url_imagen") val urlImagen: String = ""
)
