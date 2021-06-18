package com.asesoftware.semilla.ejercicioTurnos.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.service.ITurnoService;



@RestController
@RequestMapping(path = "/api/v1/turnos")
public class TurnoController {
	
	@Autowired
	private ITurnoService turnoService;
	
	//consultar todos los turnos
	
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return turnoService.getAll();
	}
	
	//consulta por id de  servicio
	
	@GetMapping(path = "/comercios/{id_comercio}/servicios/{id_servicio}")
	public ResponseDTO getComercio(@PathVariable Integer id_comercio, @PathVariable Integer id_servicio){
		return turnoService.getTurnos( id_comercio, id_servicio);
		
	}
	
}
