package com.sistemascomohogar.xyzch.controllers;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistemascomohogar.xyzch.models.entity.Cliente;
import com.sistemascomohogar.xyzch.models.service.IClienteService;

@RestController
public class SkFormatoController {

	@Autowired
	private IClienteService clienteService;

	@RequestMapping(value = "/skformato", method = RequestMethod.GET)
	public Object leerFormatoSK() throws StreamReadException, DatabindException, IOException {
		InputStream inputStream = this.getClass().getClassLoader()
				.getResourceAsStream("static/files/Referencias/sk_formato.json");
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> jsonMap = mapper.readValue(inputStream, Map.class);
		ArrayList<Object> beneficios=(ArrayList<Object>) jsonMap.get("sk_formato");
		
		List<Cliente> clientes=clienteService.findAll();
		
		if(beneficios.size()>clientes.size()) {
			Logger logger = Logger.getLogger("SKFORMATO");
			logger.info(beneficios.get(clientes.size()).toString());
			return beneficios.get(clientes.size());
		}

		return null;

	}
}
