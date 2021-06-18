package com.asesoftware.semilla.ejercicioTurnos.dto;

import java.util.Date;

import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TurnosDTO {
	
	private Integer id_turno;
	private ServicioEntity id_servicio;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd", timezone = "America/New_York")
	private Date fecha_turno;
	
	private String hora_inicio;
	private String hora_fin;
	private String estado;
	

}
