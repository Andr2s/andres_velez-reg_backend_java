package com.sistemascomohogar.xyzch.controllers;

import javax.validation.Valid;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemascomohogar.xyzch.models.entity.Cliente;

@RestController
public class SkFormatoController {

//	@Autowired
//	private IClienteService clienteService;

	@RequestMapping(value = "/skformato", method = RequestMethod.GET)
	public Cliente leerFormatoSK() {
		Cliente clientebeneficio = new Cliente();
		clientebeneficio.setBeneficio("ben3");
		return clientebeneficio;

	}
}
