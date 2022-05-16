package com.sistemascomohogar.xyzch.models.dao;

import java.util.List;

import com.sistemascomohogar.xyzch.models.entity.Cliente;

public interface IClienteDao {
	public List<Cliente> findAll();
	
	public void save(Cliente cliente);

}
