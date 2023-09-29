package com.faber;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.faber.model.Usuario;
import com.faber.repo.IUsuarioRepo;

@SpringBootTest
class JpaSpringDataApplicationTests {
	
	@Autowired
	private IUsuarioRepo repo;
	
	@Autowired BCryptPasswordEncoder encript;

	@Test
	void crearUsuarioTest() {
		Usuario us= new Usuario();
		us.setId(2);
		us.setNombre("user");
		us.setClave(encript.encode("1234"));//Se encripta la contraseña con Bcrypt
		
		Usuario resultado = repo.save(us);
		//assertTrue(resultado.getClave().equalsIgnoreCase(us.getNombre()));//Falla la prueba unitaria
		assertTrue(resultado.getClave().equalsIgnoreCase(us.getClave()));
	}

}
