package com.springboot.fundacionapp.service;

import java.util.List;

import com.springboot.fundacionapp.entity.Ayuda;

public interface AyudaService {

	
	public List<Ayuda> listadoAyudas();
	public void guardar(Ayuda ayuda);
	
	
}
