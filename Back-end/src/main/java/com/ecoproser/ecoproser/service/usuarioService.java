package com.ecoproser.ecoproser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecoproser.ecoproser.interfaceService.IusuarioService;
import com.ecoproser.ecoproser.interfaces.Iusuario;
import com.ecoproser.ecoproser.models.Usuario;

@Service
public class usuarioService implements IusuarioService { 

    
    @Autowired
    private Iusuario data;

    @SuppressWarnings("null")
    @Override
    public String save(Usuario Usuario) {
        data.save(Usuario);
        return Usuario.getIdUsuario();
    }

    @Override
    public List<Usuario> findAll() {
        List<Usuario> listaUsuario = (List<Usuario>) data.findAll();
        return listaUsuario;
    }

    @Override
    public Optional<Usuario> findOne(String id) {
        @SuppressWarnings("null")
        Optional<Usuario> Usuario = data.findById(id);
        return Usuario;
    }

    @Override
    public int delete(String id) {
        data.deleteById(id);
        return 1;
    }

}

