package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.DetallePedidos;

public interface IdetallePedidosService {
    public String save(DetallePedidos DetallePedidos);

    public List<DetallePedidos> findAll();

    public Optional<DetallePedidos> findOne(String id);

    public int delete(String id);
}
