package com.ind.shopping.shilpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseNumberTest {

	@Test
	public void testrev()
	{
		ReverseNumber rn=new ReverseNumber();
		int result=rn.revNum(47);
		assertEquals(74,result);
		

	}

}
