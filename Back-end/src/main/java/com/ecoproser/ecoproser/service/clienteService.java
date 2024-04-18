package com.ecoproser.ecoproser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IclienteService;
import com.ecoproser.ecoproser.interfaces.Icliente;
import com.ecoproser.ecoproser.models.Cliente;

@Service
public class clienteService implements IclienteService { 

    
    @Autowired
    private Icliente data;

    @SuppressWarnings("null")
    @Override
    public String save(Cliente Cliente) {
        data.save(Cliente);
        return Cliente.getIdCliente();
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> listaCliente = (List<Cliente>) data.findAll();
        return listaCliente;
    }

    @Override
    public Optional<Cliente> findOne(String id) {
        @SuppressWarnings("null")
        Optional<Cliente> Cliente = data.findById(id);
        return Cliente;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }

}

