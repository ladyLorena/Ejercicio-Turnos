package com.asesoftware.semilla.ejercicioTurnos.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicioTurnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	
	@Autowired
	private IServicioService servicioService;
	
	//consultar todos los servicios
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return servicioService.getAll();
	}
	
	//consultar por id
	@GetMapping(path = "/{id_servicio}")
	public ResponseDTO getServicioById(@PathVariable Integer id_servicio) {
		return servicioService.getServicioById(id_servicio);
	}
	
	//crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO crearServicio (@RequestBody ServicioDTO servicioDTO ) {
		return servicioService.createServicio(servicioDTO);
	}
	
	//editar
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO updateServicio(@RequestBody ServicioDTO servicioDTO) {
		return servicioService.updateServicio(servicioDTO);
		
	}
	
	
	//eliminar
	@GetMapping(path = "/eliminar/{id_servicio}")
	public ResponseDTO eliminarServicio(@PathVariable Integer id_servicio) {
		return servicioService.deleteServicio(id_servicio);
	}

}
