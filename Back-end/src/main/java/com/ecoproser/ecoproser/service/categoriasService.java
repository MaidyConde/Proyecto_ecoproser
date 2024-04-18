package com.ecoproser.ecoproser.service;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IcategoriasService;
import com.ecoproser.ecoproser.interfaces.Icategorias;
import com.ecoproser.ecoproser.models.Categorias;

@Service
public class categoriasService implements IcategoriasService {

    
    @Autowired
    private Icategorias data;

    @SuppressWarnings("null")
    @Override
    public String save(Categorias Categorias) {
        data.save(Categorias);
        return Categorias.getIdCategorias();
    }

    @Override
    public List<Categorias> findAll() {
        List<Categorias> listaCategorias = (List<Categorias>) data.findAll();
        return listaCategorias;
    }

    @Override
    public Optional<Categorias> findOne(String id) {
        @SuppressWarnings("null")
        Optional<Categorias> Categorias = data.findById(id);
        return Categorias;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }

}
