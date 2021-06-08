package com.asesoftware.semilla.ejercicioTurnos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asesoftware.semilla.ejercicioTurnos.entity.ServicioEntity;
import com.asesoftware.semilla.ejercicioTurnos.repository.IServicioRepository;


@Service
public class ServicioService implements IServicioService {
	
	@Autowired
	private IServicioRepository servicioRepository;

	@Override
	public List<ServicioEntity> getAll() {	
		return servicioRepository.findAll();
	}

	@Override
	public ServicioEntity getServicioById(Integer id_servicio) {
		Optional<ServicioEntity> optional = servicioRepository.findById(id_servicio);
		  if (optional.isPresent()) {
			  return optional.get();	
		} else {
			return null;
		}		
	}

	@Override
	public ServicioEntity createServicio(ServicioEntity servicioEntity) {
		
		return servicioRepository.save(servicioEntity);
	}

	@Override
	public ServicioEntity updateServicio(ServicioEntity servicioEntity) {
		
		return servicioRepository.save(servicioEntity);
	}

	@Override
	public void deleteServicio(Integer id_servicio) {
		servicioRepository.deleteById(id_servicio);
		
		
	}

}
