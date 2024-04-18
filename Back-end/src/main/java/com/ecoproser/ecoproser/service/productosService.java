package com.ecoproser.ecoproser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IproductosService;
import com.ecoproser.ecoproser.interfaces.Iproductos;
import com.ecoproser.ecoproser.models.Productos;

@Service
public class productosService implements IproductosService  {

    @Autowired
    private Iproductos data;

    @SuppressWarnings("null")
    @Override
    public String save(Productos Productos) {
        data.save(Productos);
        return Productos.getIdProductos();
    }

    @Override
    public List<Productos> findAll() {
        List<Productos> listaProductos = (List<Productos>) data.findAll();
        return listaProductos;
    }

    @Override
    public Optional<Productos> findOne(String id) {
        @SuppressWarnings("null")
        Optional<Productos> Productos = data.findById(id);
        return Productos;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }


}

