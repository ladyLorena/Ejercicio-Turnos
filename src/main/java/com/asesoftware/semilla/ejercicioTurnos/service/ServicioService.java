package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicioTurnos.mapper.IServicioMapper;
import com.asesoftware.semilla.ejercicioTurnos.repository.IServicioRepository;


@Service
public class ServicioService implements IServicioService {
	
	private static final Logger logger = LoggerFactory.getLogger(ServicioService.class);
	
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
		logger.info("Ingreso al metodo getServicioById {}", id_servicio);
		  if (optional.isPresent()) {
			  logger.info("Servicio a consultar {}",id_servicio);
			  return new ResponseDTO(optional.get(), true,"ok",HttpStatus.OK);	
		} else {
			logger.error("Error servicio No encontrado {}", id_servicio);
			return new ResponseDTO(null, false, "Servicio No encontrado", HttpStatus.OK);
		}		
	}

	@Override
	public ResponseDTO createServicio(ServicioDTO servicioDTO) {
		logger.info("Ingreso al metodo createServicio", servicioDTO);
		
		try {
			ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
			servicioRepository.save(servicioEntity);
			logger.info("Servicio creado", servicioDTO);
			return new  ResponseDTO(mapperServicio.entityToDto(servicioEntity), true, "ok", HttpStatus.OK);
			
		} catch (Exception e) {
			logger.error("Error no se puede crear servicio",servicioDTO);
			return new 	ResponseDTO(null,false,"No se puede crear el servicio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO updateServicio(ServicioDTO servicioDTO) {
		ServicioEntity servicioEntity = mapperServicio.dtoToEntity(servicioDTO);
		servicioRepository.save(servicioEntity);
		logger.info("Servicio Actualizado", servicioDTO);
		return new ResponseDTO(mapperServicio.entityToDto(servicioEntity), true,"ok",HttpStatus.OK);
	}

	@Override
	public ResponseDTO deleteServicio(Integer id_servicio) {
		logger.info("Ingreso al metodo deleteServicio",id_servicio);
		try {
			servicioRepository.deleteById(id_servicio);
			 logger.info("El servicio {} se elimino",id_servicio);
			return new ResponseDTO(null,true,"Servicio eliminado",HttpStatus.OK);
			
		} catch (Exception e) {
			logger.error("Error {}",e.getMessage());
			return new ResponseDTO(null,false,"El servicio no se puede eliminar",HttpStatus.OK);
		}
		
		
	}

}
