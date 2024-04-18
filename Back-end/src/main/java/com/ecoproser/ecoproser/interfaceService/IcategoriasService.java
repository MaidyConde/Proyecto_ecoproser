package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.Categorias;

public interface IcategoriasService {

    public String save(Categorias Categorias);

    public List<Categorias> findAll();

    public Optional<Categorias> findOne(String id);

    public int delete(String id);

}
