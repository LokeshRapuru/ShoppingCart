package com.ind.shopping.lokesh;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathermaticalOperationsTest {

	@Test
	public void testAdd() {
		MathematicalOperations mo = new MathematicalOperations();
		int result = mo.add(2, 3);
		assertEquals(5, result);
	}
}
