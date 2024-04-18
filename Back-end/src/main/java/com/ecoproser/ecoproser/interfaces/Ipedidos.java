package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.Pedidos;

@Repository
public interface Ipedidos  extends CrudRepository<Pedidos, String> {

}
