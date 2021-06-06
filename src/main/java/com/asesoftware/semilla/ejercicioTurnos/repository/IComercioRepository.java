package com.asesoftware.semilla.ejercicioTurnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;


public interface IComercioRepository extends JpaRepository<ComercioEntity,Integer> {

}
