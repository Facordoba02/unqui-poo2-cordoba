package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.EvenDigits;

class EvenDigitsTest {
//	private EvenDigits evenDigits;
//	
//	@BeforeEach
//	public void setUp() throws Exception{
//		evenDigits = new EvenDigits();
//		int[] numberList = {451, 23, 114, 2461, 225, 461, 12};
//		evenDigits.setNumbers(numberList);
//	}
	
	@Test
	public void testEvenCount() {
		int result = EvenDigits.evenCount(1234);
		assertEquals(result, 2);
	}
	
	@Test
	public void testEvenCounterDigits() {
		int[] numberList = {451, 23, 11422, 2461, 225, 461, 12};
		int result = EvenDigits.counterEvenDigits(numberList);
		assertEquals(result, 11422);
	}


}
