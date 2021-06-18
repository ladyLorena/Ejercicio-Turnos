package com.asesoftware.semilla.ejercicioTurnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name = "servicios")
public class ServicioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@ManyToOne
	@JoinColumn(name = "id_comercio")
	private ComercioEntity id_comercio;
	
	@Column(name = "nombre_servicio")
	private String nombreServicio;
	
	@Column(name = "hora_apertura")
	private String hora_apertura;
	
	@Column(name = "hora_cierre")
	private String hora_cierre;
	
	@Column(name = "duracion")
	private Integer duracion;
	
	//@OneToMany(mappedBy = "id_servicio")
	//private List<TurnosEntity> turnos;
	
	
	
}
