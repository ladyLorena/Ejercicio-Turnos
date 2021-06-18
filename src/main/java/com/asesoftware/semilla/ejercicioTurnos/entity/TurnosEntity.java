package com.asesoftware.semilla.ejercicioTurnos.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "turnos")
public class TurnosEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_turno")
	private Integer id_turno;

	@ManyToOne
	@JoinColumn(name = "id_servicio")
	private ServicioEntity id_servicio;
	
	@Column(name = "fecha_turno")
	@Temporal(TemporalType.DATE)
	private Date fecha_turno;
	
	@Column(name = "hora_inicio")
	private String hora_inicio;
	
	@Column(name = "hora_fin")
	private String hora_fin;
	
	@Column(name = "estado")
	private String estado;
	

}
