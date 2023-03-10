package com.facturacion.apirest.controllers;

import com.facturacion.apirest.models.entity.Cliente;
import com.facturacion.apirest.models.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})//autorizar a la url del front para comartir recursos
@RestController
@RequestMapping("/api")
public class ClienteRestController {
    @Autowired
    private IClienteService clienteService;
    //listar los clientes
    @GetMapping("/clientes")
    public List<Cliente> index(){

        return clienteService.findAll();
    };
}
