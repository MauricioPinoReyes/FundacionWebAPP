package com.springboot.fundacionapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.fundacionapp.entity.Beneficiario;
import com.springboot.fundacionapp.repository.BeneficiarioRepository;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {

	@Autowired
	BeneficiarioRepository beneficiarioRepository;
	
	
	@Override
	public List<Beneficiario> listarBeneficiarios() {
		
		return (List<Beneficiario>) beneficiarioRepository.findAll();
	}

}
