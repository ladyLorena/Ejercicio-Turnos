package com.asesoftware.semilla.ejercicioTurnos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicioTurnos.controller.TurnoController;
import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.mapper.ITurnosMapper;
import com.asesoftware.semilla.ejercicioTurnos.repository.ITurnoRepository;

@Service
public class TurnoService implements ITurnoService {
	
	private static final Logger logger = LoggerFactory.getLogger(TurnoService.class);
	
	@Autowired
	private ITurnoRepository turnosRepository;
	
	@Autowired
	private ITurnosMapper mapperTurnos;
	
	@Override
	public ResponseDTO getAll() {
		logger.info("Ingreso al metodo getAll");
		return new ResponseDTO(mapperTurnos.listEntityToDto(turnosRepository.findAll()),true,"ok",HttpStatus.OK);	
	}

	@Override
	public ResponseDTO getTurnos(Integer id_comercio, Integer id_servicio) {
		logger.info("Ingreso al metodo  getTurnos");
	      return new  ResponseDTO(mapperTurnos.listEntityToDto(turnosRepository.findByComercioAndServicio(id_comercio, id_servicio)),true,"ok",HttpStatus.OK);
	
	
	}
}
