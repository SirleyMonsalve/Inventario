package co.com.Inventarioproducto.controllers.consultas;


import co.com.Inventarioproducto.model.Producto;
import co.com.Inventarioproducto.servicio.impl.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;




//@RestController
//@RequestMapping("/consulta")
public class ConsultaProductoController {

    @Autowired
    private ProductoService productoService;

    //@GetMapping("/productos")
    public List<Producto> getTipoTarifa(){
        return productoService.getProductos();
    }


}
