package com.coomeva.api.v1.CoomevaApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coomeva.api.v1.CoomevaApi.model.Transaccion;



@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Integer>{
	
}
