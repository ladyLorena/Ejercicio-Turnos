package com.asesoftware.semilla.ejercicioTurnos.service;


import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ServicioDTO;

public interface IServicioService {

	public ResponseDTO getAll();
	
	public ResponseDTO getServicioById(Integer id_servicio);
	
	public ResponseDTO createServicio(ServicioDTO servicioDTO);
	
	public ResponseDTO updateServicio(ServicioDTO servicioDTO);
	
	public ResponseDTO deleteServicio(Integer id_servicio);
}
