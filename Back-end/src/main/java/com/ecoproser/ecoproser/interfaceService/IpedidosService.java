package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.Pedidos;

public interface IpedidosService {
    public String save(Pedidos Pedidos);

    public List<Pedidos> findAll();

    public Optional<Pedidos> findOne(String id);

    public int delete(String id);

}
