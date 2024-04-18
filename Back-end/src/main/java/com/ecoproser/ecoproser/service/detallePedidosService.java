package com.ecoproser.ecoproser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IdetallePedidosService;
import com.ecoproser.ecoproser.interfaces.IdetallePedidos;
import com.ecoproser.ecoproser.models.DetallePedidos;

@Service
public class detallepedidosService implements IdetallePedidosService { 

    
    @Autowired
    private IdetallePedidos data;

    @SuppressWarnings("null")
    @Override
    public String save(DetallePedidos DetallePedidos) {
        data.save(DetallePedidos);
        return DetallePedidos.getIdDetallePedidos();
    }

    @Override
    public List<DetallePedidos> findAll() {
        List<DetallePedidos> listaDetallePedidos = (List<DetallePedidos>) data.findAll();
        return listaDetallePedidos;
    }

    @Override
    public Optional<DetallePedidos> findOne(String id) {
        @SuppressWarnings("null")
        Optional<DetallePedidos> DetallePedidos = data.findById(id);
        return DetallePedidos;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }

}
