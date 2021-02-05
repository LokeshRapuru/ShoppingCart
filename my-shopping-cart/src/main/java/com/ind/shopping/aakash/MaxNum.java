package com.ind.shopping.aakash;

public class MaxNum {
	public static int findMax(int arr[]){
		int max=0;
		for(int i=1;i<arr.length;i++){
		if(max<arr[i])
		max=arr[i];
		}
		return max;
		}
	public static int comapre(int x,int y) {
		int a=x;
		int b=y;
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
