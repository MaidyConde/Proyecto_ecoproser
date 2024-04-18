package com.ecoproser.ecoproser.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoproser.ecoproser.interfaceService.IdetallePedidosService;
import com.ecoproser.ecoproser.models.DetallePedidos;

@RequestMapping("/api/v1/DetallePedidos/")
@RestController
public class detallePedidosController {

    @Autowired
    private IdetallePedidosService detallePedidosService; 

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("DetallePedidos") DetallePedidos DetallePedidos) {
        
        detallePedidosService.save(DetallePedidos);
        return new ResponseEntity<>(DetallePedidos, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaDetallePedidos = detallePedidosService.findAll();
        return new ResponseEntity<>(listaDetallePedidos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var DetallePedidos = detallePedidosService.findOne(id);
        return new ResponseEntity<>(DetallePedidos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    detallePedidosService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("DetallePedidos") DetallePedidos DetallePedidosUpdate) {
        var DetallePedidos = detallePedidosService.findOne(id).get();
        if (DetallePedidos != null) {

            DetallePedidos.setCantidad(DetallePedidosUpdate.getCantidad());
            DetallePedidos.setPrecioUnitario(DetallePedidosUpdate.getPrecioUnitario());
            DetallePedidos.setPedidos(DetallePedidosUpdate.getPedidos());
            DetallePedidos.setProductos(DetallePedidosUpdate.getProductos()); 
            
            detallePedidosService.save(DetallePedidos);
            return new ResponseEntity<>(DetallePedidos, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error cliente NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    

}



