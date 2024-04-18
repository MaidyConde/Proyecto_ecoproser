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

import com.ecoproser.ecoproser.interfaceService.IclienteService;
import com.ecoproser.ecoproser.models.Cliente;

@RequestMapping("/api/v1/Cliente/")
@RestController
public class clienteController {

    @Autowired
    private IclienteService clienteService;

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Cliente") Cliente Cliente) {
        
        clienteService.save(Cliente);
        return new ResponseEntity<>(Cliente, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaCliente = clienteService.findAll();
        return new ResponseEntity<>(listaCliente, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Cliente = clienteService.findOne(id);
        return new ResponseEntity<>(Cliente, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    clienteService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Cliente") Cliente ClienteUpdate) {
        var Cliente = clienteService.findOne(id).get();
        if (Cliente != null) {

            Cliente.setTipoDocumento(ClienteUpdate.getTipoDocumento());
            Cliente.setNumeroDocumento(ClienteUpdate.getNumeroDocumento());
            Cliente.setPrimerNombre(ClienteUpdate.getPrimerNombre());
            Cliente.setSegundoNombre(ClienteUpdate.getSegundoNombre());
            Cliente.setPrimerApellido(ClienteUpdate.getPrimerApellido());
            Cliente.setSegundoApellido(ClienteUpdate.getSegundoApellido());
            Cliente.setCorreo(ClienteUpdate.getCorreo());
            Cliente.setTelefono(ClienteUpdate.getTelefono());
            Cliente.setDireccion(ClienteUpdate.getDireccion());

          
            clienteService.save(Cliente);
            return new ResponseEntity<>(Cliente, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error cliente NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    

}

