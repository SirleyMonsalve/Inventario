package co.com.Inventarioproducto;

import co.com.Inventarioproducto.model.InventarioProducto;
import co.com.Inventarioproducto.model.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InventarioProductoTest {

    @Test
    public void crearInventarioSinFechaIngreso(){
        try {
            InventarioProducto inventarioProducto = new InventarioProducto.InventarioProductoBuilder().build();

        }catch (Exception e){
            assertEquals(InventarioProducto.FECHA_INGRESO_REQUERIDA,e.getMessage());
        }
    }
    @Test
    public void crearInventarioSinProductos(){
        try {
            InventarioProducto inventarioProducto = new InventarioProducto.InventarioProductoBuilder()
                    .setFechaIngreso(new Date())
                    .build();

        }catch (Exception e){
            assertEquals(InventarioProducto.FECHA_INGRESO_REQUERIDA,e.getMessage());
        }
    }
}
