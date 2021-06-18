package com.asesoftware.semilla.ejercicioTurnos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.asesoftware.semilla.ejercicioTurnos.entity.TurnosEntity;

public interface ITurnoRepository extends JpaRepository<TurnosEntity, Integer> {
	

	@Query("SELECT t FROM TurnosEntity t INNER JOIN t.id_servicio s INNER JOIN s.id_comercio c WHERE s.id_servicio =:id_servicio AND c.id_comercio =:id_comercio ")
	public List<TurnosEntity> findByComercioAndServicio(@Param("id_comercio") Integer id_comercio, @Param("id_servicio") Integer id_servicio);
}


