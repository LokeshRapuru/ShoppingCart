package com.ind.shopping.mayur;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculationTest {
	@Test
	public void testSub() {
		Calculation cal = new Calculation();
		int result = cal.sub(7, 3);
		assertEquals(4, result);
		System.out.println(result);
	}
}