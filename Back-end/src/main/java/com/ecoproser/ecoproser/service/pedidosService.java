package com.ecoproser.ecoproser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IpedidosService;
import com.ecoproser.ecoproser.interfaces.Ipedidos;
import com.ecoproser.ecoproser.models.Pedidos;

@Service
public class pedidosService implements IpedidosService  {

    @Autowired
    private Ipedidos data;

    @SuppressWarnings("null")
    @Override
    public String save(Pedidos Pedidos) {
        data.save(Pedidos);
        return Pedidos.getIdPedidos();
    }

    @Override
    public List<Pedidos> findAll() {
        List<Pedidos> listaDetallePedidos = (List<Pedidos>) data.findAll();
        return listaDetallePedidos;
    }

    @Override
    public Optional<Pedidos> findOne(String id) {
        @SuppressWarnings("null")
        Optional<Pedidos> Pedidos = data.findById(id);
        return Pedidos;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }


}
