package co.com.Inventarioproducto.model;

import co.com.Inventarioproducto.exception.BusinnessException;
import co.com.Inventarioproducto.util.Validator;

public class Producto {
    private Integer idProducto;
    private Integer precio;
    private String nombre;
    private boolean activo;
    private Integer stock;

    public static final String ID_VACIO = "El id producto no puede ser nulo";
    public static final String NOMBRE_VACIO = "El nombre no puede ser vacío";
    public static final String VALOR_PRODUCTO_NO_VALIDO = "El valor de la tarifa no puede ser 0";

    public static class ProductoBuilder {
        private Integer idProducto;
        private Integer precio;
        private String nombre;
        private boolean activo;
        private Integer stock;

        public ProductoBuilder setIdProducto(Integer idProducto) {
            this.idProducto = idProducto;
            return this;
        }
        public ProductoBuilder setPrecio(Integer precio) {
            this.precio = precio;
            return this;
        }
        public ProductoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }
        public ProductoBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }
        public ProductoBuilder setStock(int stock) {
            this.stock = stock;
            return this;
        }
        public Producto build() throws BusinnessException {
            Producto producto = new Producto();
            Validator.valorNulo(idProducto,ID_VACIO);
            producto.idProducto = idProducto;
            Validator.valorNulo(nombre,NOMBRE_VACIO);
            producto.nombre = nombre;
            Validator.valorCero(precio,VALOR_PRODUCTO_NO_VALIDO);
            producto.precio = precio;
            producto.activo = activo;
            return producto;
        }


    }

    public Integer getIdProducto() {
        return idProducto;
    }
    public Integer getPrecio() {
        return precio;
    }
    public boolean isActivo() {
        return activo;
    }
    public Integer getStock() { return stock; }
    public String getNombre() { return nombre; }








}
