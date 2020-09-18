package co.com.Inventarioproducto.controllers.consultas;

import co.com.Inventarioproducto.model.InventarioProducto;
import java.util.List;
import co.com.Inventarioproducto.servicio.impl.InventarioProductoService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;




//@RestController
//@RequestMapping("/consulta")
public class ColsultaInventarioProductoController {

    @Autowired
    InventarioProductoService inventarioProductoService;

    //@GetMapping("/inventario")
    public List<InventarioProducto> getInventario(){
        return inventarioProductoService.getInventarioProducto();
    }


}
