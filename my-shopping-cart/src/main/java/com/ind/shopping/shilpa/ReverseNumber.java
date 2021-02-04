package com.ind.shopping.shilpa;

public class ReverseNumber {

	public int revNo(int num)
	{
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
		

	}


