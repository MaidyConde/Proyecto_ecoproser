package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.DetallePedidos;

@Repository
public interface IdetallePedidos  extends CrudRepository< DetallePedidos, String>{

}
