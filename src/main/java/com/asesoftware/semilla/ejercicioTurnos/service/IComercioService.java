package com.asesoftware.semilla.ejercicioTurnos.service;


import com.asesoftware.semilla.ejercicioTurnos.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;

public interface IComercioService {

	public ResponseDTO getAll();
	
	public ResponseDTO getComercioById(Integer id_comercio);
	
	public ResponseDTO createComercio(ComercioDTO comercioDTO);
	
	public ResponseDTO updateComercio(ComercioDTO comercioDTO);
	
	public ResponseDTO deleteComercio(Integer id_comercio);
}
