package com.ind.shopping.pratiksha;

public class ReverseOperations {
	public int add(int a, int b) {
		return a + b;
	}
	public int reverseNumber(int num) {
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
			
		}
		return rev;
	}

}
