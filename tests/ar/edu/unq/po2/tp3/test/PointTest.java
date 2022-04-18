package ar.edu.unq.po2.tp3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

class PointTest {
	private Point punto0;
	private Point puntoCoor;
	
	@BeforeEach
	public void setUp() throws Exception{
		punto0= new Point();
		puntoCoor = new Point(2,4);
	}
	
	@Test
	void testPunto0() {
		assertEquals(punto0.getX(),0);
		assertEquals(punto0.getY(),0);
	}
	
	@Test
	void testPuntoCoor() {
		assertEquals(puntoCoor.getX(),2);
		assertEquals(puntoCoor.getY(),4);
	}
	
	@Test
	void testMoverPunto() {
		puntoCoor.mover(5, 3);
		assertEquals(puntoCoor.getX(),5);
		assertEquals(puntoCoor.getY(),3);
	}
	
	@Test
	void testSumarConOtroPunto() {
		puntoCoor.sumarConOtroPunto(new Point(1,2));
		assertEquals(puntoCoor.getX(),3);
		assertEquals(puntoCoor.getY(),6);
	}

}
