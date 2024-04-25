package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.Usuario;

@Repository
public interface Iusuario  extends CrudRepository< Usuario, String>{

}
