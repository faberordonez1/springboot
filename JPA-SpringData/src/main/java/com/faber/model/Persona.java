package com.faber.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
	@Id //Llave primaria
	private int idPersona;
	
	@Column(name="nombre",length=50) //Columna en tabla BD
	private String nombre;
	
	public int getIdPersona() {
		return this.idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona=idPersona;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

}
