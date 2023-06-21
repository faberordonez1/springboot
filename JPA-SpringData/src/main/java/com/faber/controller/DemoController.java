package com.faber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.faber.model.Persona;
import com.faber.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	        model.addAttribute("name",name);//Modelo de spring para agg variables a la vista
	        
	        Persona p = new Persona();
	        p.setIdPersona(1);
	        p.setNombre("Faber");	
	        repo.save(p);
	        
	        return "greeting"; //página a navegar
	  }

}
