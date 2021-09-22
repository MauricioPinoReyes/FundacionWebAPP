package com.springboot.fundacionapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ciudades")
public class Ciudad {

	@Id
	@Column(name="ciudad_id")
	private int ciudadId;
	
	@Column(name="nombre_ciudad")
	private String nombreCiudad;

}
