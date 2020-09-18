package co.com.Inventarioproducto.servicio.impl;

import co.com.Inventarioproducto.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoServiceHardConding implements ProductoService {
    @Override
    public List<Producto> getProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(producto1());
        productos.add(producto2());
        productos.add(producto3());
        productos.add(producto4());

        return productos;
    }

    private Producto producto1(){
        return new Producto.ProductoBuilder()
                .setActivo(true)
                .setIdProducto(1)
                .setNombre("Carro")
                .setPrecio(443542)
                .setStock(28)
                .build();
    }

    private Producto producto2(){
        return new Producto.ProductoBuilder()
                .setActivo(true)
                .setIdProducto(2)
                .setNombre("Moto")
                .setPrecio(43256453)
                .setStock(28)
                .build();
    }
    private Producto producto3(){
        return new Producto.ProductoBuilder()
                .setActivo(true)
                .setIdProducto(3)
                .setNombre("Guantes")
                .setPrecio(1651566131)
                .setStock(28)
                .build();
    }
    private Producto producto4(){
        return new Producto.ProductoBuilder()
                .setActivo(true)
                .setIdProducto(4)
                .setNombre("Casco")
                .setPrecio(342342)
                .setStock(28)
                .build();
    }



}
