package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.Categorias;

@Repository
public interface Icategorias  extends CrudRepository< Categorias, String>{

}
