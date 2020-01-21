package ch.bbw.ss.ConsoleCalculator;

/**
 * Test class for Class Calculator
 * 
 * @author Sandra Seehars
 * @version 0.0.1
 */

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	Calculator testee;
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void testSumTwoPositivesIsOk() {
		assertTrue(testee.sum(10, 25) == 35);
	}
	
	@Test
	public void testSumTwoNegativesIsOk() {
		assertTrue(testee.sum(-10,  -25) == -35);
	}
	
	@Test
	public void testSubtractionTwoPositivesIsOk() {
		assertTrue(testee.subtract(25,  10) == 15);
	}
	
	@Test
	public void testSubtractionTwoNegativesIsOk() {
		assertTrue(testee.subtract(-25,  -10) == -15);
	}
}
