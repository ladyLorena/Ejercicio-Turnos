package com.asesoftware.semilla.ejercicioTurnos.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(ComercioController.class);
	
	@Autowired
	private IComercioService comercioService;

	//Listar todos
	@GetMapping(path = "/all")
	public ResponseDTO getAll(){
		return comercioService.getAll();
	}
	
	// Listar uno
	
	@GetMapping(path = "/{id_comercio}")
	public ResponseDTO getComercioById(@PathVariable Integer id_comercio) {
		logger.info("Comercio a listar {}",id_comercio);
		return comercioService.getComercioById(id_comercio);
	}
	
	// Crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ResponseDTO createComercio (@RequestBody ComercioDTO comercioDTO) {
		logger.info("Ingreso a crear comercio: {}", comercioDTO);
		return comercioService.createComercio(comercioDTO);
	}
	
	// Editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ResponseDTO editarComercio (@RequestBody ComercioDTO comercioDTO) {
		logger.info("Ingreso a editar comercio: {}", comercioDTO);
		return  comercioService.updateComercio(comercioDTO);
	}
	
	//Eliminar
	@GetMapping(path = "/eliminar/{id_comercio}")
	public ResponseDTO eliminarComercio(@PathVariable Integer id_comercio) {
		
		logger.info("Ingreso al metodo Eliminar Comercio");
		logger.info("Comercio a eliminar {}",id_comercio);
		
		  return comercioService.deleteComercio(id_comercio);
		
	}
}
