package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.Cliente;

public interface IclienteService {
    public String save(Cliente Cliente);

    public List<Cliente> findAll();

    public Optional<Cliente> findOne(String id);

    public int delete(String id);

}
