package com.varun.dzone.java;

import java.util.function.Function;

public class FunctionJava {
	public static void main(String[] args) {
		Function<Integer, Integer> adder = x -> x + 1;
		System.out.println(adder.apply(5));
	}
}
