package com.asesoftware.semilla.ejercicioTurnos.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "comercios")
public class ComercioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_comercio")
	private Integer id_comercio;
	
	@Column(name = "nombre_comercio")
	private String nombre_comercio;
	
	@Column(name = "aforo_maximo")
	private Integer aforo_maximo;

	//public Integer getId_comercio() {
	//	return id_comercio;
	//}	
	
    //@OneToMany(mappedBy = "id_comercio")
	//private List<ServicioEntity> servicios;
}