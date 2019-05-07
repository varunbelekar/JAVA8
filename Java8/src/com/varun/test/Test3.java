package com.varun.test;

import java.util.Arrays;

public class Test3 {
	
	public static int[] getMultipliedArray(int a[],int fact){
		for (int i = 0; i < a.length; i++) {
			a[i] = fact/a[i];
		}		
		return a;
	}
	
	public static int factorial(int a[]){
		int mul=1;
		for (int i = 0; i < a.length; i++) {
			mul *= a[i];
		}
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5};
		int[] b=getMultipliedArray(a , factorial(a));
		
		//System.out.println(factorial(a));
		System.out.println(Arrays.toString(b));
	}

}
