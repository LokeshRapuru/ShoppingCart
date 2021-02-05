package com.ind.shopping.yogeshwari;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ind.shopping.lokesh.MathematicalOperations;

public class ReverseNumberTest {

	@Test
	public void testReverse() {
		 ReverseNumber mo = new  ReverseNumber();
		int result = mo.reverseNumber(678);
		assertEquals(876, result);
	}
}
