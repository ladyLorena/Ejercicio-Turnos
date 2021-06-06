package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.List;

import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;

public interface IComercioService {

	public List<ComercioEntity> getAll();
	
	public ComercioEntity getComercioById(Integer id_comercio);
	
	public ComercioEntity createComercio(ComercioEntity comercioEntity);
	
	public ComercioEntity   updateComercio(ComercioEntity comercioEntity);
	
	public void deleteComercio(Integer id_comercio);
}
