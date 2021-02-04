package com.ind.shopping.avinash;

public class Mathoperations {
	
	public int mula(int a1, int b1) {
		return a1 * b1;
		
	}
	public int add(int a1, int b1) {
		return a1 + b1;
	}
	
	public int division(int a1, int b1) {
		return a1 / b1;
	}
	public int sub(int a1, int b1) {
		return a1  - b1;
	}
	
	public int factoriala(int a1) {
		int fact =1;
		for(int i=1;i<=5;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	public int prime(int n) {
		int  temp = 1;
		for(int i=2;i<=n;i++) {
			if(n % i == 0)
			{
				temp++;
			}
		}
		if(temp==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		return n;
	}
	
	public int even(int n) {
		if(n%2==0) {
			System.out.println("even no");
		}else {
			System.out.println("odd no");
		}
			
		return n ;
	}
}
