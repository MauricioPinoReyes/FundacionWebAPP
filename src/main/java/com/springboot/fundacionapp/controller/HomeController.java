package com.springboot.fundacionapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.fundacionapp.entity.Ayuda;
import com.springboot.fundacionapp.entity.Beneficiario;
import com.springboot.fundacionapp.service.AyudaService;
import com.springboot.fundacionapp.service.BeneficiarioService;

@Controller
public class HomeController {

	@Autowired
	AyudaService ayudaService;
	
	@Autowired
	BeneficiarioService beneficiarioService;
	
	
	@GetMapping("/home")
	public String listarBeneficiarios(Model model,@ModelAttribute Ayuda ayuda) {
		
		List<Beneficiario> lBeneficiarios=beneficiarioService.listarBeneficiarios();
		List<Ayuda> lAyudas=ayudaService.listadoAyudas();
		
		model.addAttribute("titulo","Listado de ciudades y ayuda");
		model.addAttribute("listAyudas", lAyudas);
		model.addAttribute("listBeneficiarios", lBeneficiarios);
		
			return "home";
	}
	
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute Ayuda ayuda) {
		
		ayudaService.guardar(ayuda);
		System.out.println("Ayuda Ingresada....");
		
			return "redirect:/home";
	}
}
