package com.ind.shopping.mayur;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Calculation1TestCase {

	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(27, Calculation1.cube(3));
	}

}
