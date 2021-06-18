package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicioTurnos.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicioTurnos.dto.ResponseDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;
import com.asesoftware.semilla.ejercicioTurnos.mapper.IComercioMapper;
import com.asesoftware.semilla.ejercicioTurnos.repository.IComercioRepository;

@Service
public class ComercioService implements IComercioService {
	
	@Autowired
	private IComercioRepository comercioRepository;
	
	@Autowired
	private IComercioMapper mapperComercio;

	@Override
	public ResponseDTO getAll() {
		
		return new ResponseDTO( mapperComercio.listEntityToDto(comercioRepository.findAll()), true, "ok",HttpStatus.OK);
	}

	@Override
	public ResponseDTO getComercioById(Integer id_comercio) {
		Optional<ComercioEntity> optional = comercioRepository.findById(id_comercio);
		
		if(optional.isPresent()) {
			return new ResponseDTO(optional.get(), true,"ok",HttpStatus.OK);
		}else {
			return new ResponseDTO(null, false, "Usuario No encontrado", HttpStatus.OK);
		}		
					
	}		
			
	@Override
	public ResponseDTO createComercio(ComercioDTO comercioDTO) {
		
		try {
			ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
			comercioRepository.save(comercioEntity);
			return new  ResponseDTO(mapperComercio.entityToDto(comercioEntity), true, "ok", HttpStatus.OK);
			
		} catch (Exception e) {
			return new 	ResponseDTO(null,false,"No se puede crear el comercio", HttpStatus.OK);
		}
	}

	@Override
	public ResponseDTO updateComercio(ComercioDTO comercioDTO) {
		ComercioEntity comercioEntity = mapperComercio.dtoToEntity(comercioDTO);
		 comercioRepository.save(comercioEntity);
		 
		 return new ResponseDTO(mapperComercio.entityToDto(comercioEntity), true,"ok",HttpStatus.OK);
	}

	@Override
	public ResponseDTO deleteComercio(Integer id_comercio) {
		
		try {
			comercioRepository.deleteById(id_comercio);
			return new ResponseDTO(null,true,"Comercio eliminado",HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseDTO(null,false,"El comercio no se puede eliminar",HttpStatus.OK);
		}
		
		
	}

}
