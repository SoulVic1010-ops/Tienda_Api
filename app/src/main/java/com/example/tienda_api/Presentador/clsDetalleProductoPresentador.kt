package com.example.tienda_api.Presentador

import com.example.tienda_api.Modelo.clsProductosModelo
import com.example.tienda_api.Modelo.dataImagenesProducto
import com.example.tienda_api.Vista.DetalleProductoActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class clsDetalleProductoPresentador(private val vista: DetalleProductoActivity) {
    private val modelo= clsProductosModelo()
    fun cargarDetalle(productoId: Int){
        CoroutineScope(Dispatchers.Main).launch {
            try {
                //Aqui se consume obtenerDetalleProducto del modelo
                val listaImagenes: List<dataImagenesProducto> = modelo.obtenerDetallesProducto(productoId)
                vista.mostrarImagenes(listaImagenes)
            }catch (e: Exception){
                vista.mostrarError("Error cargar detalle"+ e.localizedMessage)
            }
        }
    }
}