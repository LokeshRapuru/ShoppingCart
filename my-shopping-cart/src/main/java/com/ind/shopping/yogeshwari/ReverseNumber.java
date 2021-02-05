package com.ind.shopping.yogeshwari;

public class ReverseNumber {

	
	public int RevNumber(int num) {
		int rev=0;
		while(num>0) {
		rev=rev*10+num%10;
		num=num/10;

		}
		return rev;
		}
}
