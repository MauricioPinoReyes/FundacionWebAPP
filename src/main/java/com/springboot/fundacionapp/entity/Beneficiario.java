package com.springboot.fundacionapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="beneficiarios")
public class Beneficiario {

	@Id
	@Column(name="beneficiario_id")
	private int beneficiarioId;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="edad")
	private String edad;
	
	@ManyToOne
	@JoinColumn(name="ciudad_id")
	private Ciudad ciudad;

}
