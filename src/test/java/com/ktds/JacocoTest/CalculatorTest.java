package com.ktds.JacocoTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.sum(1, 2));
	}
	
	@Test
	public void testSub() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.sub(5, 2));
	}

}
