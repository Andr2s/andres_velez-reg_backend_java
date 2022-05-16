package com.sistemascomohogar.xyzch.controllers;

import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sistemascomohogar.xyzch.models.entity.Cliente;

@RestController
public class ThFormatoController {

//	@Autowired
//	private IClienteService clienteService;

	@RequestMapping(value = "/thformato", method = RequestMethod.GET)
	public Cliente leerFormatoTH() {
		Cliente clientebeneficio=new Cliente();
		clientebeneficio.setBeneficio("ben2");
		return clientebeneficio;

	}
}
