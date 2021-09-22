package com.springboot.fundacionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.fundacionapp.entity.Ayuda;
import com.springboot.fundacionapp.repository.AyudaRepository;

@Service
public class AyudaServiceImpl implements AyudaService {

	@Autowired
	AyudaRepository ayudaRepository;
	
	@Override
	public List<Ayuda> listadoAyudas() {
		return (List<Ayuda>) ayudaRepository.findAll();
		
	}

	@Override
	public void guardar(Ayuda ayuda) {
		
		ayudaRepository.save(ayuda);
	}

}
