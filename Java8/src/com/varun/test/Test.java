package com.varun.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Stream;


public class Test {
	
	public static int countPrime(Integer[] a){
		return Stream.of(a)
			  .filter(i -> new BigInteger(String.valueOf(i)).isProbablePrime(1))
			  .count()
			  ;
		
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			Integer[] a = new Integer[n];
			for (int j = 0; j < a.length; j++) {
				a[i] = sc.nextInt();
			}
			System.out.println(countPrime(a));
		}
	}
}
