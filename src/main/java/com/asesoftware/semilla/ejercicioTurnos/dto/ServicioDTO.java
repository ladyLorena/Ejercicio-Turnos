package com.asesoftware.semilla.ejercicioTurnos.dto;

import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;

import lombok.Data;

@Data
public class ServicioDTO {

	private Integer id_servicio;	
	private ComercioEntity id_comercio;	
	private String nombre_servicio;
	private String hora_apertura;
	private String hora_cierre;
	private Integer duracion;
	
	
	
	
}
