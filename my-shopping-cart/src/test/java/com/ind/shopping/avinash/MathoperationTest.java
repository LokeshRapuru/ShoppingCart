package com.ind.shopping.avinash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathoperationTest {

	@Test
	public void testmul() {
		Mathoperations obj = new Mathoperations();
		int result = obj.mul(8, 2);
		assertEquals(16, result);
		System.out.println("Mul " + result);
	}

	@Test
	public void testadd() {
		Mathoperations obj1 = new Mathoperations();
		int result1 = obj1.add(2, 7);
		assertEquals(9, result1);
		System.out.println("add " + result1);
	}

	@Test
	public void testdivision() {
		Mathoperations obj2 = new Mathoperations();
		int result2 = obj2.division(4, 2);
		assertEquals(2, result2);
		System.out.println("div " + result2);
	}

	@Test
	public void testsub() {
		Mathoperations obj2 = new Mathoperations();
		int result2 = obj2.sub(8, 2);
		assertEquals(6, result2);
		System.out.println("sub " + result2);
	}

	@Test
	public void testfactorial() {
		Mathoperations obj3 = new Mathoperations();
		int result3 = obj3.factorial(5);
		assertEquals(120, result3);
		System.out.println("fact " + result3);
	}

	@Test
	public void testprime() {
		Mathoperations obj4 = new Mathoperations();
		int result4 = obj4.prime(12);
		assertEquals(12, result4);
		System.out.println("No is " + result4);
	}
}