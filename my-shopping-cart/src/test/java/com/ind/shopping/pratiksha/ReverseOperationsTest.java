package com.ind.shopping.pratiksha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class ReverseOperationsTest {
	@Test
	public void testAdd() {
		ReverseOperations obj = new ReverseOperations();
		int result = obj.add(2, 3);
		assertEquals(5, result);
	}
	public void testSub() {
		ReverseOperations obj = new ReverseOperations();
		int result = obj.sub(5, 3);
		assertEquals(2, result);
	}
	public void testmul() {
		ReverseOperations obj = new ReverseOperations();
		int result = obj.mul(2, 3);
		assertEquals(6, result);
	}

	public void testDiv() {
		ReverseOperations obj = new ReverseOperations();
		int result = obj.div(6, 3);
		assertEquals(2, result);
	}

		@Test
		public void reverseNumber() {
			ReverseOperations mo = new ReverseOperations();
			int result = mo.reverseNumber(543);
			assertEquals(345, result);
		}
}
