package com.asesoftware.semilla.ejercicioTurnos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "turnos")
public class TurnosEntity {
	
	@Id
	@Column(name = "id_turno")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_turno;
	
	@Column(name = "id_servicio")
	private Integer id_servicio;
	
	@Column(name = "fecha_turno")
	private Date fecha_turno;
	
	@Column(name = "hora_inicio")
	private String hora_inicio;
	
	@Column(name = "hora_fin")
	private String hora_fin;
	
	@Column(name = "estado")
	private String estado;
	

}
