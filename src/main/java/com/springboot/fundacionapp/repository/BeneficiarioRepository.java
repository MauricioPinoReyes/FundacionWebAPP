package com.springboot.fundacionapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.fundacionapp.entity.Beneficiario;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario,Integer> {

	
	
	
}
