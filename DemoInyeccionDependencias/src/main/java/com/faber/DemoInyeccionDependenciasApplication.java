package com.faber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.faber.service.IPersonaService;
import com.faber.service.PersonaServiceImpl;

@SpringBootApplication
public class DemoInyeccionDependenciasApplication implements CommandLineRunner{
	
	private static Logger LOG = LoggerFactory.getLogger(DemoInyeccionDependenciasApplication.class);
	@Autowired //Inyecta la implementacion
	private IPersonaService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoInyeccionDependenciasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Devs, desde consola");// Sysout + ctl+espacio
		LOG.info("Hola DEVs, Info Info");		//Alternativa Sysout
		
		// service = new PersonaServiceImpl(); //Implentadicon tradicional sin inyecc de dependencias
		service.registrar("Faber");
	}

}
