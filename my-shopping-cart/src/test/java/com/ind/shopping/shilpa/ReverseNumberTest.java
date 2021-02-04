package com.ind.shopping.shilpa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseNumberTest {

	@Test
	public void testrev()
	{
		ReverseNumber rn=new ReverseNumber();
		int result=rn.revNo(473);
		assertEquals(374,result);
		

	}

}
