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

import com.ecoproser.ecoproser.interfaceService.IusuarioService;
import com.ecoproser.ecoproser.models.Usuario;

@RequestMapping("/api/v1/Usuario/")
@RestController
public class usuarioController {

    @Autowired
    private IusuarioService usuarioService;

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Usuario") Usuario Usuario) {
        var listaUsuario = usuarioService.findAll()
                .stream().filter(usuario -> usuario.getNumeroDocumento()
                         .equals(Usuario.getNumeroDocumento()));
        if(listaUsuario.count()!=0){
            return new ResponseEntity<>("El documento ya existe", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getContraseña().equals("")) {
            return new ResponseEntity<>("El campo contraseña es obligatorio", HttpStatus.BAD_REQUEST); 
        }
        if (Usuario.getNumeroDocumento().equals("")) {
            return new ResponseEntity<>("El campo numero documento es obligatorio", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getPrimerNombre().equals("")) { 
            return new ResponseEntity<>("El campo primer nombre es obligatorio", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getPrimerApellido().equals("")) {
            return new ResponseEntity<>("El campo primer apellido es obligatorio", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getCorreo().equals("")) {
            return new ResponseEntity<>("El campo primer correo es obligatorio", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getTelefono().equals("")) {
            return new ResponseEntity<>("El campo telefono es obligatorio", HttpStatus.BAD_REQUEST);
        }
        if (Usuario.getDireccion().equals("")) {
            return new ResponseEntity<>("El campo direccion es obligatorio", HttpStatus.BAD_REQUEST);
        }

        usuarioService.save(Usuario);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaUsuario = usuarioService.findAll();
        return new ResponseEntity<>(listaUsuario, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Usuario = usuarioService.findOne(id);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    usuarioService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Usuario") Usuario UsuarioUpdate) {
        var Usuario = usuarioService.findOne(id).get();
        if (Usuario != null) {

            Usuario.setTipoDocumento(UsuarioUpdate.getTipoDocumento());
            Usuario.setNumeroDocumento(UsuarioUpdate.getNumeroDocumento());
            Usuario.setPrimerNombre(UsuarioUpdate.getPrimerNombre());
            Usuario.setSegundoNombre(UsuarioUpdate.getSegundoNombre());
            Usuario.setPrimerApellido(UsuarioUpdate.getPrimerApellido());
            Usuario.setSegundoApellido(UsuarioUpdate.getSegundoApellido());
            Usuario.setCorreo(UsuarioUpdate.getCorreo());
            Usuario.setTelefono(UsuarioUpdate.getTelefono());
            Usuario.setDireccion(UsuarioUpdate.getDireccion());

          
            usuarioService.save(Usuario);
            return new ResponseEntity<>(Usuario, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error usuario NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    

}

