package com.ind.shopping.aakash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testCase_Maxnum {
	@Test
	public void testFindMax(){
	MaxNum maxnum=new MaxNum();
	assertEquals(4,maxnum.findMax(new int[]{1,3,4,2}));
	int result=maxnum.comapre(3, 2);
	assertEquals(3, result);
	

}
}
