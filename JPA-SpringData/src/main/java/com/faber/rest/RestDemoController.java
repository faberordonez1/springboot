package com.faber.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.faber.model.Persona;
import com.faber.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	IPersonaRepo repo;
	
	@GetMapping	
	public List<Persona>listar(){
		return repo.findAll();
	}
	
	// sE ESTA COMPORTANDO IGUAL QUE EL PUT, NO GENERA EL CONSECUTIVO SI NO SE PASA EL ID
	@PostMapping
	public void crear(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	
	@PutMapping
	public void actualizar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {//Captura el id enviado por url
		repo.deleteById(id);
		//No borra id cero (0)
	}
	

}
