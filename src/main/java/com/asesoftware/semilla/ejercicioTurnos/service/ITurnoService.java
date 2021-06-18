package com.asesoftware.semilla.ejercicioTurnos.service;

import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;

public interface ITurnoService {
	
	public ResponseDTO getAll();

	public ResponseDTO getTurnos(Integer id_comercio, Integer id_servicio );


}
