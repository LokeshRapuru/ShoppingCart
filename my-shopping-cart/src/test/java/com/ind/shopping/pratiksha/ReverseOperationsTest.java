package com.ind.shopping.pratiksha;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class ReverseOperationsTest {
	

		@Test
		public void reverseNumber() {
			ReverseOperations mo = new ReverseOperations();
			int result = mo.reverseNumber(543);
			assertEquals(345, result);
		}
}
