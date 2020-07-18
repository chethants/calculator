/**
 * 
 */
package com.cts.training;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author 676326
 *
 */
public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc  = new Calculator();
		assertEquals(10, calc.add(5, 5));
		
	}
	
	@Test
	public void subTest() {
		Calculator calc  = new Calculator();
		assertEquals(5, calc.sub(10, 5));
		
	}
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator();
		assertEquals(50, calc.multiply(10,5));
	}
}
