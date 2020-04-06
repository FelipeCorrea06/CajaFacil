package com.coomeva.api.v1.CoomevaApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coomeva.api.v1.CoomevaApi.model.Transaccion;
import com.coomeva.api.v1.CoomevaApi.service.TransaccionService;


@RestController
@RequestMapping(value="/transacciones")
public class TransaccionController {
	
	@Autowired
	TransaccionService servicioTran;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Transaccion> consultarTransacciones() {
		return servicioTran.consultarTodos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
	@PostMapping(path = "/saveTransaccion", consumes =  { "application/Json " })
	public Transaccion crearTransaccion(@RequestBody Transaccion transaccion) {
		return servicioTran.crearTransaccion(transaccion);
	}
	
}
