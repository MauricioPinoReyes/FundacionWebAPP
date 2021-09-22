package com.springboot.fundacionapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Ayudas")
public class Ayuda {

	
	@Id	
	@SequenceGenerator(name = "AyudasIdGenerator", sequenceName =("AYUDAS_SEQ"),allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AyudasIdGenerator")
	@Column(name="ayuda_id",insertable=false, updatable=false)
	private int ayudaId;
	
	
	@ManyToOne
	@JoinColumn(name="beneficiario_id")
	private Beneficiario beneficiario;
	
	@Column(name="monto")
	private int monto;
	
	@Column(name="motivo")
	private String motivo;

}
