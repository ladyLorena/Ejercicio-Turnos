package com.asesoftware.semilla.ejercicioTurnos.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.asesoftware.semilla.ejercicioTurnos.dto.TurnosDTO;
import com.asesoftware.semilla.ejercicioTurnos.entity.TurnosEntity;

@Mapper(componentModel = "spring")
public interface ITurnosMapper {
	
	    public TurnosEntity dtoToEntity(TurnosDTO turnosDto);
		
		public TurnosDTO entityToDto(TurnosEntity tunosEntity);
	   
		public List<TurnosDTO> listEntityToDto(List<TurnosEntity> turnosEntity);
		
		public List<TurnosEntity> listDtoEntity(List<TurnosDTO> turnosDto);

}
