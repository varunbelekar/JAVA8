package com.varun.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

//Complete the code
interface Abc{
	public int sqauare(int x);
}

public class Test {

	public static void main(String[] args) throws Exception {
		Abc a=x-> x*x;
		System.out.println(a.sqauare(5));
	
	}
	
}