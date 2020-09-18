package co.com.Inventarioproducto;

import co.com.Inventarioproducto.model.Producto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductoTest {

    @Test
    public void crearProductoSinNombre(){
        try {
            Producto producto = new Producto.ProductoBuilder().build();

        }catch (Exception e){
            assertEquals(Producto.NOMBRE_VACIO,e.getMessage());
        }
    }

    @Test
    public void crearProductoSinPrecio(){
        try {
            Producto producto = new Producto.ProductoBuilder().setNombre("Carro").build();

        }catch (Exception e){
            assertEquals(Producto.VALOR_PRODUCTO_NO_VALIDO,e.getMessage());

        }
    }
}
