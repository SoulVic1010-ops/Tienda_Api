package com.example.tienda_api.Modelo

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@Serializable

data class dataProductos(
    @SerialName(value = "id") val id: Int = 0,
    @SerialName(value = "categoria_id") val categoriaid: Int = 0,
    @SerialName(value = "nombre") val nombre: String = "",
    @SerialName(value = "descripcion") val descripcion: String = "Sin descripcion",
    @SerialName(value = "precio") val precio: String = "0.0",
    @SerialName(value = "url_imagen_principal") val urlimagenprincipal: String = ""
)
