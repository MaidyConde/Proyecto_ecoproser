package com.ecoproser.ecoproser.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoproser.ecoproser.models.Cliente;

@Repository
public interface Icliente  extends CrudRepository< Cliente, String>{

}
