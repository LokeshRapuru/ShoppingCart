package com.ind.shopping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.ind.shopping.vaibhav.model.MultiplyNo;

public class MultiplyTest {

	
	@Test
	public void testMethod() {
		int result=MultiplyNo.multiplyOfTwoNumbers(10, 20);
		assertEquals(200, result);
	}
}
