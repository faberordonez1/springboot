package com.faber.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/***************************************************************** 
 * @Repository -> Decorador para permitir la inyccion dependencias.
 * 
 * @Qualifier("identificador")-> Identificador para casos donde  existen 
 * multiples implementaciones de la misma interface, se usa tanto en la clase 
 * donde se implementa como en el lugar donde se inyecta. 
 * 
 * Si solo existe una implementación no es necesario utilizar Qualifier. 
*/

@Repository
@Qualifier("Persona2") 
public class PersonaRepoImpl2 implements IPersonaRepo{
	
	private static Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl2.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("Registrando persona con Implementacion 2", nombre);
	}

}
