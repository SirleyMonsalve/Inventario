package co.com.Inventarioproducto.util;

import co.com.Inventarioproducto.exception.BusinnessException;

import java.util.Date;

public class Validator {


    public static void valorNulo(String valor, String mensaje) throws BusinnessException {
        if(valor == null){
            throw new BusinnessException(mensaje);
        }
    }

    public static void valorCero(double valor, String mensaje) throws BusinnessException {
        if(valor == 0){
            throw new BusinnessException(mensaje);
        }
    }

    public static void validarObjetoNulo(Object object, String mensaje) throws BusinnessException {
        if(object == null){
            throw new BusinnessException(mensaje);
        }
    }


    public static void validarFechaNula(Date fecha, String mensaje) throws BusinnessException {
        if(fecha == null){
            throw new BusinnessException(mensaje);
        }
    }

    public static void validarIgualCero(double valor, String mensaje) {
        if(valor == 0){
            throw new BusinnessException(mensaje);
        }
    }
}