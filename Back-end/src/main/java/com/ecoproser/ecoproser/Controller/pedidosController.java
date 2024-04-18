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

import com.ecoproser.ecoproser.interfaceService.IpedidosService;
import com.ecoproser.ecoproser.models.Pedidos;

@RequestMapping("/api/v1/Pedidos/")
@RestController
public class pedidosController {

    @Autowired
    private IpedidosService pedidosService; 

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Pedidos") Pedidos Pedidos) {
        
        pedidosService.save(Pedidos);
        return new ResponseEntity<>(Pedidos, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaPedidos = pedidosService.findAll();
        return new ResponseEntity<>(listaPedidos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Pedidos = pedidosService.findOne(id);
        return new ResponseEntity<>(Pedidos, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    pedidosService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Pedidos") Pedidos PedidosUpdate) {
        var Pedidos = pedidosService.findOne(id).get();
        if (Pedidos != null) {

            Pedidos.setEstado(PedidosUpdate.getEstado());
            Pedidos.setFechaPedido(PedidosUpdate.getFechaPedido());
            Pedidos.setProductos(PedidosUpdate.getProductos());
            Pedidos.setCliente(PedidosUpdate.getCliente()); 
            
            pedidosService.save(Pedidos);
            return new ResponseEntity<>(Pedidos, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error cliente NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    



}
