package com.facturacion.apirest.models.services;

import com.facturacion.apirest.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
