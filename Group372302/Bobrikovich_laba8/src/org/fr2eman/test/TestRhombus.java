package org.fr2eman.test;

import static org.junit.Assert.*;

import org.fr2eman.test.exceptions.WrongFormatException;
import org.junit.Test;

public class TestRhombus {

	@Test
	public void testTrueSquare() throws WrongFormatException {
		Rhombus rhombus = new Rhombus(10, 10);
		double square = 10 * 10;
		assertTrue(rhombus.colcualteSquare() == square);
	}
	
	@Test
	public void testFalseSquare() throws WrongFormatException {
		Rhombus rhombus = new Rhombus(10, 10);
		double square = 10 * 10 - 1;
		assertFalse(rhombus.colcualteSquare() == square);
	}
	
	@Test
	public void testTruePerimeter() throws WrongFormatException {
		Rhombus rhombus = new Rhombus(4, 10);
		double perimeter = 4 * 4;
		assertTrue(rhombus.colcualtePerimeter() == perimeter);
	}
	
	@Test
	public void testFalsePerimeter() throws WrongFormatException {
		Rhombus rhombus = new Rhombus(25, 1);
		double perimeter = 4 * 25 + 0.001;
		assertFalse(rhombus.colcualtePerimeter() == perimeter);
	}
	
	@Test(expected = WrongFormatException.class)
	public void testExceptionNotPositiveWidth() throws WrongFormatException {
		new Rhombus(1, -65);
	}
	
	@Test(expected = WrongFormatException.class)
	public void testExceptionNotPositiveSide() throws WrongFormatException {
		new Rhombus(-4, 0);
	}
	
}
