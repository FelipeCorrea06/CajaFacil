package com.coomeva.api.v1.CoomevaApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coomeva.api.v1.CoomevaApi.model.Cuenta;
import com.coomeva.api.v1.CoomevaApi.service.CuentaService;


@RestController
@RequestMapping(value="/cuentas")
public class CuentaController {
	
	@Autowired
	CuentaService servicio;
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/todos")
	public List<Cuenta> consultarCuentas() {
		return servicio.consultarTodos();
	}
	
	@CrossOrigin(origins = "*", methods= {RequestMethod.GET})
	@GetMapping(path = "/byUser")
	public Cuenta consultarCuentas(@RequestParam(value="cedula") int cedula, @RequestParam(value="usuario") String usuario) {
		return servicio.consultarCedulaUsuario(cedula, usuario);
	}
	
}
