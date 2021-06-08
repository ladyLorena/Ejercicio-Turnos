package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.List;

import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;

public interface IServicioService {

	public List<ServicioEntity> getAll();
	
	public ServicioEntity getServicioById(Integer id_servicio);
	
	public ServicioEntity createServicio(ServicioEntity servicioEntity);
	
	public ServicioEntity updateServicio(ServicioEntity servicioEntity);
	
	public void deleteServicio(Integer id_servicio);
}
