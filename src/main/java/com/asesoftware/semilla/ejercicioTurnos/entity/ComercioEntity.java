package com.asesoftware.semilla.ejercicioTurnos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	public Integer getId_comercio() {
		return id_comercio;
	}

	public void setId_comercio(Integer id_comercio) {
		this.id_comercio = id_comercio;
	}

	public String getNombre_comercio() {
		return nombre_comercio;
	}

	public void setNombre_comercio(String nombre_comercio) {
		this.nombre_comercio = nombre_comercio;
	}

	public Integer getAforo_maximo() {
		return aforo_maximo;
	}

	public void setAforo_maximo(Integer aforo_maximo) {
		this.aforo_maximo = aforo_maximo;
	}
	
}