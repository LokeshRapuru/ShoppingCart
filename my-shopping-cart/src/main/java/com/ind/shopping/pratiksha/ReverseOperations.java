package com.ind.shopping.pratiksha;

public class ReverseOperations {
	public int add(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public int div(int a, int b) {
		return a / b;
	}
	public int reverseNumber(int num) {
		int rev_num=0;
		while(num>0) {
			rev_num=rev_num*10+num%10;
			num=num/10;	
		}
		return rev_num;
	}

}
