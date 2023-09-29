package com.faber.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;

@Entity
public class Usuario {
  
	@Id
	private int id;
	private String nombre;
	private String clave;
	
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
