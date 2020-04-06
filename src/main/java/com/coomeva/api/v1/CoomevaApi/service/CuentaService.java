package com.coomeva.api.v1.CoomevaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coomeva.api.v1.CoomevaApi.model.Cuenta;
import com.coomeva.api.v1.CoomevaApi.repository.CuentaRepository;

@Service
public class CuentaService {
	@Autowired
	CuentaRepository repository;
	List<Cuenta> lista;
	
	public List<Cuenta> consultarTodos() {
		return repository.findAll();
	}
	
	public Cuenta consultarCedulaUsuario(int cedula, String usuario) {
		return repository.findByCedulaAndUsuario(cedula, usuario);
	}
}
