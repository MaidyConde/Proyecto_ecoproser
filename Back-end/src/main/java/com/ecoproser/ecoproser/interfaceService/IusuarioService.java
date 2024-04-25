package com.ecoproser.ecoproser.interfaceService;

import java.util.List;
import java.util.Optional;

import com.ecoproser.ecoproser.models.Usuario;

public interface IusuarioService {
    public String save(Usuario Usuario);

    public List<Usuario> findAll();

    public Optional<Usuario> findOne(String id);

    public int delete(String id);

}
