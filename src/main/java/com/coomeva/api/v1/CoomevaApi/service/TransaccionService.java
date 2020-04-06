package com.coomeva.api.v1.CoomevaApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coomeva.api.v1.CoomevaApi.model.Transaccion;
import com.coomeva.api.v1.CoomevaApi.repository.TransaccionRepository;

@Service
public class TransaccionService {
	@Autowired
	TransaccionRepository repository;
	List<Transaccion> lista;
	
	public List<Transaccion> consultarTodos() {
		return repository.findAll();
	}
	
	public Transaccion crearTransaccion(Transaccion transaccion) {
		
		Transaccion transacciones = null;
		try {
			transacciones = repository.save(transaccion);
			if (transacciones != null) {
			}
		} catch (Exception e) {
			System.out.println("Error general: "+e.getMessage());
		}
		
		return transacciones;
	}
}
