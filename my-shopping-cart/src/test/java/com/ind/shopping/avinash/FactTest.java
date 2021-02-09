package com.ind.shopping.avinash;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class FactTest {
	@Test
	public void testfactorial() {
		Fact obj3 = new Fact();
		int result3 = obj3.factorial(5);
		assertEquals(120, result3);
		System.out.println("fact " + result3);
	}
}
