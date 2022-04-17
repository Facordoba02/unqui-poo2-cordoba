package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EvenDigits;

class EvenDigitsTest {
	private EvenDigits evenDigits;
	
	@BeforeEach
	public void setUp() throws Exception{
		evenDigits = new EvenDigits();
		int[ ] numberList = {451, 23, 114, 2461, 225, 461, 12};
		evenDigits.setNumbers(numberList);
	}
	
	@Test
	public void testEvenCount() {
		int result = evenDigits.evenCount(1234);
		assertEquals(result, 2);
	}
	
	@Test
	public void testEvenCounterDigits() {
		int result = evenDigits.counterEvenDigits();
		assertEquals(result, 2461);
	}


}
