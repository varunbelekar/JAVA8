package com.varun.test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Prime{
	public void checkPrime(Integer...n){
		java.util.stream.Stream.of(n)
			  .filter( i -> new BigInteger(String.valueOf(i)).isProbablePrime(1))
			  .forEach((j) -> System.out.print(j + " "));
	}
	
}

public class Test4 {
	
	public static void main(String[] args) {
		new Prime().checkPrime(2, 3, 5, 6);
	}

}
