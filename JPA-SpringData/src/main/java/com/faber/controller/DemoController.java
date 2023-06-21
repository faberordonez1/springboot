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
	        
					//Se crea la persona y sus datos, lo ideal es hacerlo en el service
	        Persona p = new Persona();
	        p.setIdPersona(2);
	        p.setNombre("Javier");	
	        repo.save(p);//Guarda en BD, usando la interface repo que tiene extiende de JPA
	        
	        return "greeting"; //página a navegar
	  }
	
	/* En este ejemplo se obtienen toda las personas de BD usando el método findAll y se le pasan a 
	la vista para que los muestre */
	
	@GetMapping("/listar")
	public String listar( Model model) {
		    model.addAttribute("name","Listar");
	        model.addAttribute("personas",repo.findAll());//Pasa todas las personas a la vista
	             
	        return "greeting"; //página a navegar
	  }

}
