package com.facturacion.apirest.models.services;

import com.facturacion.apirest.models.dao.IClienteDao;
import com.facturacion.apirest.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    IClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
}
