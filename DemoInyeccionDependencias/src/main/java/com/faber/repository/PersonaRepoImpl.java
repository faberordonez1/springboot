package com.faber.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository //Para inyeccion de dependencias
@Qualifier("Persona1") //Identificador de la implementacion para casos donde  existen multiples implementaciones
public class PersonaRepoImpl implements IPersonaRepo{
	private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);


	@Override
	public void registrar(String nombre) {
		LOG.info("Registrando a " +nombre);
	}

}
