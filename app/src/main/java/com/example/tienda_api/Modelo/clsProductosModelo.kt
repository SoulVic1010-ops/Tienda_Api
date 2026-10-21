package com.example.tienda_api.Modelo

class clsProductosModelo {
    suspend fun obtenerProductosPorCategoria(categoriaId: Int): List<dataProductos>{
        return RetrofitCliente.apiService.obtenerProductos(categoriaId)
    }
    suspend fun obtenerDetallesProducto(productosId: Int): List<dataImagenesProducto>{
        return RetrofitCliente.apiService.detalleProducto(productosId)
    }
}