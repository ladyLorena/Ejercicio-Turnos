package com.asesoftware.semilla.ejercicioTurnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicioTurnos.service.IComercioService;

import net.bytebuddy.asm.Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName;

@RestController
@RequestMapping(path = "/api/v1/comercios")
public class ComercioController {
	
	@Autowired
	private IComercioService comercioService;

	//listar todos
	@GetMapping(path = "/all")
	public List<ComercioEntity> getAll(){
		return comercioService.getAll();
	}
	
	// listar uno
	
	@GetMapping(path = "/{id_comercio}")
	public ComercioEntity getComercioById(@PathVariable Integer id_comercio) {
		return comercioService.getComercioById(id_comercio);
	}
	
	// crear
	@PostMapping(path = "/crear", consumes = "application/json", produces = "application/json")
	public ComercioEntity createComercio (@RequestBody ComercioEntity entity) {
		return  comercioService.createComercio(entity);
	}
	
	// editar
	
	@PostMapping(path = "/editar", consumes = "application/json", produces = "application/json")
	public ComercioEntity editarComercio (@RequestBody ComercioEntity entity) {
		return  comercioService.updateComercio(entity);
	}
	
	//eliminar
	@GetMapping(path = "/eliminar/{id_comercio}")
	public void eliminarComercio(@PathVariable Integer id_comercio) {
		
		 comercioService.deleteComercio(id_comercio);
		
	}
}
