package com.asesoftware.semilla.ejercicioTurnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.semilla.ejercicioTurnos.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.ComercioEntity;

@Mapper(componentModel = "spring")
public interface IComercioMapper {
	
	public ComercioEntity dtoToEntity(ComercioDTO comercioDTO);
	
	public ComercioDTO entityToDto(ComercioEntity comercioEntity);
   
	public List<ComercioDTO> listEntityToDto(List<ComercioEntity> comercioEntity);
	
	public List<ComercioEntity> listDtoEntity(List<ComercioDTO> comercioDTO);
	
	
}
