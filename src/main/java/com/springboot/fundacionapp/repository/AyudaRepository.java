package com.springboot.fundacionapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.fundacionapp.entity.Ayuda;

@Repository
public interface AyudaRepository extends JpaRepository<Ayuda,Integer> {

}
