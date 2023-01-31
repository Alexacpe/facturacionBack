package com.facturacion.apirest.models.dao;

import com.facturacion.apirest.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
