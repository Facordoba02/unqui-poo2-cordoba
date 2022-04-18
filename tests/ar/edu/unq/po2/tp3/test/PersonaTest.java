package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Persona;

class PersonaTest {
	private Persona persona1;
	private Persona persona2;
	
	@BeforeEach
	public void setUp() throws Exception{
		persona1 = new Persona("Facundo", LocalDate.of(2000, Month.FEBRUARY, 23));
		persona2 = new Persona("Hernán", LocalDate.of(1998, Month.MAY, 23));
	}
	
	@Test
	void testEdad() {
		long result = persona1.edad();
		assertEquals(result,22);
		
	}
	@Test
	void testMenorQue() {
		boolean result = persona1.menorQue(persona2);
		assert(result);
	}

}
