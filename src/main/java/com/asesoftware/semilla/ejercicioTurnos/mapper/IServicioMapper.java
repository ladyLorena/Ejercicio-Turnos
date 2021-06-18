package com.asesoftware.semilla.ejercicioTurnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.semilla.ejercicioTurnos.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;

@Mapper(componentModel = "spring")
public interface IServicioMapper {
	
    public ServicioEntity dtoToEntity(ServicioDTO servicioDTO);
	
	public ServicioDTO entityToDto(ServicioEntity servicioEntity);
   
	public List<ServicioDTO> listEntityToDto(List<ServicioEntity> servicioEntity);
	
	public List<ServicioEntity> listDtoEntity(List<ServicioDTO> servicioDTO);
		
}
