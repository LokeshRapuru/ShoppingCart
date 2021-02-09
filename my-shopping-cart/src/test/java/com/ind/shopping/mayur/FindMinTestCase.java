package com.ind.shopping.mayur;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;




public class FindMinTestCase {
   
@Test
public void testFindMin(){  
	FindMin m = new FindMin();
    
    assertEquals(1,m.findMin(new int[]{1,3,4,2}));  
	
}  }


