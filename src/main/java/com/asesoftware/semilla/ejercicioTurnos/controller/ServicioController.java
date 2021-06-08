package com.asesoftware.semilla.ejercicioTurnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicioTurnos.service.IServicioService;

@RestController
@RequestMapping(path = "/api/v1/servicio")
public class ServicioController {
	
	
	@Autowired
	private IServicioService servicioService;
	
	//listar todos
	@GetMapping(path = "/all")
	public List<ServicioEntity> getAll(){
		return servicioService.getAll();
	}
	
	//listar uno 
	@GetMapping(path = "/{id_servicio}")
	public ServicioEntity getServicioById(@PathVariable Integer id_servicio) {
		return servicioService.getServicioById(id_servicio);
	}
	
	//crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ServicioEntity crearServicio (@RequestBody ServicioEntity entity ) {
		return servicioService.createServicio(entity);
	}
	
	//editar
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ServicioEntity editarServicio(@RequestBody ServicioEntity entity) {
		return servicioService.updateServicio(entity);
		
	}
	
	
	//eliminar
	@GetMapping(path = "/eliminar/{id_servicio}")
	public void eliminarServicio(@PathVariable Integer id_servicio) {
		servicioService.deleteServicio(id_servicio);
	}

}
