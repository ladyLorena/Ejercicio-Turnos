package com.asesoftware.semilla.ejercicioTurnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;

public interface IServicioRepository extends JpaRepository<ServicioEntity, Integer> {
	
	
}
