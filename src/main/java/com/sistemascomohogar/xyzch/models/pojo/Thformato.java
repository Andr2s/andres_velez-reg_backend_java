package com.sistemascomohogar.xyzch.models.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Thformato {
	
	private Beneficio beneficios;

	
	public Thformato() {
		super();
	}

	public Thformato(Beneficio beneficios) {
		super();
		this.beneficios = beneficios;
	}

	@XmlElement
	public Beneficio getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(Beneficio beneficios) {
		this.beneficios = beneficios;
	}
	
	

}
