package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.Productos;

public interface IproductosService {
    public String save(Productos Productos);

    public List<Productos> findAll();

    public Optional<Productos> findOne(String id);

    public int delete(String id);

}
