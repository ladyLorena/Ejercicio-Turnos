package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicioTurnos.mapper.IServicioMapper;
import com.asesoftware.semilla.ejercicioTurnos.repository.IServicioRepository;


@Service
public class ServicioService implements IServicioService {
	
	@Autowired
	private IServicioRepository servicioRepository;

	@Autowired
	private IServicioMapper mapperServicio;
	
	@Override
	public ResponseDTO getAll() {	
		return new ResponseDTO(mapperServicio.listEntityToDto(servicioRepository.findAll()), true,"ok",HttpStatus.OK);
	}

	@Override
	public ResponseDTO getServicioById(Integer id_servicio) {
		Optional<ServicioEntity> optional = servicioRepository.findById(id_servicio);
		  if (optional.isPresent()) {
			  return new ResponseDTO(optional.get(), true,"ok",HttpStatus.OK);	
		} else {
			return new ResponseDTO(null, false, "Servicio No encontrado", HttpStatus.OK);
		}		
	}

	@Override
	public ResponseDTO createServicio(ServicioDTO servicioDTO) {
		
		try {
			ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
			servicioRepository.save(servicioEntity);
			return new  ResponseDTO(mapperServicio.entityToDto(servicioEntity), true, "ok", HttpStatus.OK);
			
		} catch (Exception e) {
			return new 	ResponseDTO(null,false,"No se puede crear el comercio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO updateServicio(ServicioDTO servicioDTO) {
		ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
		servicioRepository.save(servicioEntity);
		return new ResponseDTO(mapperServicio.entityToDto(servicioEntity), true,"ok",HttpStatus.OK);
	}

	@Override
	public ResponseDTO deleteServicio(Integer id_servicio) {
		try {
			servicioRepository.deleteById(id_servicio);
			return new ResponseDTO(null,true,"Servicio eliminado",HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseDTO(null,false,"El servicio no se puede eliminar",HttpStatus.OK);
		}
		
		
	}

}
