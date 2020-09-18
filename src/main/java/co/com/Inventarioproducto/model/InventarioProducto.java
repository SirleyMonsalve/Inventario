package co.com.Inventarioproducto.model;

import co.com.Inventarioproducto.util.Validator;

import java.util.ArrayList;
import java.util.Date;

public class InventarioProducto {

    private Integer idInventarioProducto;
    private Date fechaIngreso;
    private Date fechaSalida;
    private ArrayList<Producto> lstProductos = new ArrayList<Producto>();

    public static final String FECHA_INGRESO_REQUERIDA = "La fecha de ingreso es requerida";
    public static final String FECHA_SALIDA_REQUERIDA = "La fecha de salida es requerida";
    public static final String CANTIDAD_DIFERENTE_DE_CERO = "La cantidad debe ser superior a cero";
    public static final String PRODUCTOS_NULO = "la lista de productos no puede ser nula";


    public static class InventarioProductoBuilder{
        private Integer idInventarioProducto;
        private Date fechaIngreso;
        private Date fechaSalida;
        private ArrayList<Producto> lstProductos = new ArrayList<>();

        public InventarioProductoBuilder setIdInventarioProducto(Integer idInventarioProducto) {
            this.idInventarioProducto = idInventarioProducto;
            return this;
        }
        public InventarioProductoBuilder setFechaIngreso(Date fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
            return this;
        }
        public InventarioProductoBuilder setFechaSalida(Date fechaSalida) {
            this.fechaSalida = fechaSalida;
            return this;
        }
        public InventarioProductoBuilder setLstProductos(ArrayList<Producto> lstProductos) {
            this.lstProductos = lstProductos;
            return this;
        }
        public InventarioProducto build(){
            InventarioProducto inventarioProducto = new InventarioProducto();
            inventarioProducto.idInventarioProducto= idInventarioProducto;
            Validator.validarFechaNula(fechaIngreso,FECHA_INGRESO_REQUERIDA);
            inventarioProducto.fechaIngreso= fechaIngreso;
            inventarioProducto.fechaSalida=fechaSalida;
            Validator.validarObjetoNulo(lstProductos,PRODUCTOS_NULO);
            inventarioProducto.lstProductos=lstProductos;

            return inventarioProducto;

        }


    }

    public Integer getIdInventarioProducto() {
        return idInventarioProducto;
    }



    public Date getFechaIngreso() {
        return fechaIngreso;
    }



    public Date getFechaSalida() {
        return fechaSalida;
    }


    public ArrayList<Producto> getLstProductos() {
        return lstProductos;
    }




}
