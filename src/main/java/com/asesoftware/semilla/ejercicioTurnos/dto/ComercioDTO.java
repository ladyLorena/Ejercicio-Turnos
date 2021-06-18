package com.asesoftware.semilla.ejercicioTurnos.dto;


import lombok.Data;

@Data
public class ComercioDTO {
	
	private Integer id_comercio;
	private String nombre_comercio;
	private Integer aforo_maximo;
	//private List<ServicioDTO> servicios;

}
