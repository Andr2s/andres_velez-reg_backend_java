package com.sistemascomohogar.xyzch.controllers;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistemascomohogar.xyzch.models.entity.Cliente;
import com.sistemascomohogar.xyzch.models.pojo.Thformato;
import com.sistemascomohogar.xyzch.models.service.IClienteService;

@RestController
public class ThFormatoController {

	@Autowired
	private IClienteService clienteService;

	@RequestMapping(value = "/thformato", method = RequestMethod.GET)
	public Object leerFormatoTH() throws StreamReadException, DatabindException, IOException, URISyntaxException, JAXBException {
		
		URL filexml = this.getClass().getClassLoader().getResource("static/files/Referencias/th_formato.xml");
		File file=new File(filexml.toURI());
		JAXBContext jaxbContext = JAXBContext.newInstance(Thformato.class);  
		
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Thformato thf= (Thformato) jaxbUnmarshaller.unmarshal(file); 
		List<Cliente> clientes=clienteService.findAll();
		
		List<String> beneficios=thf.getBeneficios().getBeneficio();
		
			
		if(beneficios.size()>clientes.size()) {
			Logger logger = Logger.getLogger("THFORMAT");
			Cliente retorno=new Cliente();
			retorno.setBeneficio(beneficios.get(clientes.size()));
			logger.info(beneficios.get(clientes.size()));
			return retorno;
		}

		return null;

	}
}
