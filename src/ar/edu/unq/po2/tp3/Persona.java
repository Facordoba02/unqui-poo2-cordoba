package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
	private String nombre;
	private LocalDate fechaNac;

	public Persona(String nombre, LocalDate fechaNac) {
		this.setNombre(nombre);
		this.setFechaNac(fechaNac);
	}
	
	public long edad() {
		return ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
	}
	
	public long getEdad() {
		return this.edad();
	}
	
	public boolean menorQue(Persona persona) {
		return this.getEdad() < persona.getEdad();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac; 
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
}

/**
 * 1. Responder: Si un objeto cualquiera que le pide la edad a una Persona: 
 * ¿Conoce cómo ésta calcula u obtiene tal valor? 
 * ¿Cómo se llama el mecanismo de abstracción que permite esto?
 * 
 * */
