package com.ecoproser.ecoproser.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecoproser.ecoproser.interfaceService.IcategoriasService;
import com.ecoproser.ecoproser.models.Categorias;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;





@RequestMapping("/api/v1/Categorias/")
@RestController
public class categoriasController {

    @Autowired
    private IcategoriasService categoriasService;

    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Categorias") Categorias Categorias) {
        
        categoriasService.save(Categorias);
        return new ResponseEntity<>(Categorias, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaCategorias = categoriasService.findAll();
        return new ResponseEntity<>(listaCategorias, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id) {
        var Categorias = categoriasService.findOne(id);
        return new ResponseEntity<>(Categorias, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
    categoriasService.delete(id);
    return new ResponseEntity<>("Registro eliminado", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable String id, @ModelAttribute("Categorias") Categorias CategoriasUpdate) {
        var Categorias = categoriasService.findOne(id).get();
        if (Categorias != null) {

            Categorias.setNombreCategorias(CategoriasUpdate.getNombreCategorias());
            Categorias.setDescripcionCategorias(CategoriasUpdate.getDescripcionCategorias());
          
            categoriasService.save(Categorias);
            return new ResponseEntity<>(Categorias, HttpStatus.OK);

        } else {
            return new ResponseEntity<>("Error Ingreso NO Encontrado", HttpStatus.BAD_REQUEST);
        }
    }
    

}
