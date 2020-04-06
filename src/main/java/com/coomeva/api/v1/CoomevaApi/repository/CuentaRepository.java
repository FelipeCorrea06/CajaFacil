package com.coomeva.api.v1.CoomevaApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coomeva.api.v1.CoomevaApi.model.Cuenta;

@Repository
public interface CuentaRepository extends JpaRepository<Cuenta, Integer>{

	public Cuenta findByCedulaAndUsuario(int cedula, String usuario);
}
