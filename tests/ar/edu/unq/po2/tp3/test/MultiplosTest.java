package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multiplos;

class MultiplosTest {

	@Test
	public void testMultiplosOk() {
		int result = Multiplos.multiploMasAltoEntre(3,9);
		assertEquals(result,999);
	}
	
	@Test
	public void testMultiplosFail() {
		int result = Multiplos.multiploMasAltoEntre(37,57);
		assertEquals(result,-1);
	}

}
