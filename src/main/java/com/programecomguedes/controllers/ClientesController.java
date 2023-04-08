package com.programecomguedes.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.programecomguedes.dto.Cliente;

@RestController
public class ClientesController {
	
	@PostMapping(path = "clientes/novo", consumes = "application/json")
	public void novoCliente(@Validated @RequestBody Cliente cliente) {
		System.out.println(cliente.toString());
	}
}
