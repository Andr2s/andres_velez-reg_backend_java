package com.sistemascomohogar.xyzch.models.service;

import java.util.List;

import com.sistemascomohogar.xyzch.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();

	public void save(Cliente cliente);
}
