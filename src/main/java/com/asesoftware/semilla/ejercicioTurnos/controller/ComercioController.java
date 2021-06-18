package com.asesoftware.semilla.ejercicioTurnos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asesoftware.semilla.ejercicioTurnos.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.service.IComercioService;


@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;

	//listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return comercioService.getAll();
	}
	
	// listar uno
	
	@GetMapping(path = "/{id_comercio}")
	public ResponseDTO getComercioById(@PathVariable Integer id_comercio) {
		return comercioService.getComercioById(id_comercio);
	}
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createComercio (@RequestBody ComercioDTO comercioDTO) {
		return comercioService.createComercio(comercioDTO);
	}
	
	// editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarComercio (@RequestBody ComercioDTO comercioDTO) {
		return  comercioService.updateComercio(comercioDTO);
	}
	
	//eliminar
	@GetMapping(path = "/eliminar/{id_comercio}")
	public ResponseDTO eliminarComercio(@PathVariable Integer id_comercio) {
		
		  return comercioService.deleteComercio(id_comercio);
		
	}
}
