package com.varun.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


interface PerformOperation {
	 boolean check(int a);
}
public class Test2 {
	
	public static boolean isOdd(int x){
	    return x % 2 != 0;
	}
	
	 
	 public int reverse(int x) {
		StringBuilder sb  = (x >= 0) ? new StringBuilder( Integer.toString(x)) : new StringBuilder( Integer.toString(x * -1));
		String reverseNumberString = sb.reverse().toString();
		Integer revNumber = new Integer(reverseNumberString);
		return (x >= 0) ? revNumber.intValue() : revNumber.intValue() * -1;
	  }
	public static void main(String[] args) {
		PerformOperation performOperation = Test2::isOdd;
		System.out.println(performOperation.check(6));
	}

}
