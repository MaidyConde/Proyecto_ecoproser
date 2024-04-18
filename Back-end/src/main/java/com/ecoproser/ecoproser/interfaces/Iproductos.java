package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.Productos;

@Repository
public interface Iproductos extends CrudRepository<Productos, String> {


}
