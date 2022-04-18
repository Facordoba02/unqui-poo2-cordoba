package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTest {
	private Multioperador multioperador;
	int[] arrNumeros = {2,4,5,6,1,2};
	
	@BeforeEach
	public void setUp() throws Exception{
		multioperador = new Multioperador();
	}
	
	@Test
	public void testSuma() {
		int result = multioperador.suma(arrNumeros);
		assertEquals(result,20);
	}
	
	@Test
	public void testResta() {
		int result = multioperador.resta(arrNumeros);
		assertEquals(result,-16);
	}

	@Test
	public void testMultiplicar() {
		int result = multioperador.multiplicar(arrNumeros);
		assertEquals(result,480);
	}


}
