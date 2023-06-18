package com.faber.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.faber.repository.IPersonaRepo;
import com.faber.repository.PersonaRepoImpl;
@Service // Para inyeccion de dependencias
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired //Inyecta la implementacion
	@Qualifier("Persona1") //Identificador de la implementacion para casos donde  existen multiples implementaciones
	private IPersonaRepo repo;
	
	@Autowired //Inyecta la implementacion
	@Qualifier("Persona2") //Identificador de la implementacion para casos donde  existen multiples implementaciones
	private IPersonaRepo repo2;

	@Override
	public void registrar(String nombre) {
		// repo = new PersonaRepoImpl(); //Implentadicon tradicional sin inyecc de dependencias
		repo.registrar(nombre);
		repo2.registrar(nombre);
	}

}
