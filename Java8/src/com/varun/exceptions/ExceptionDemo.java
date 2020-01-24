package com.varun.exceptions;

public class ExceptionDemo {
	public static void methode3()  {
		int a = 50 / 0;
	}
	
	public static void method2(){
		methode3();
	}
	
	public static void method1() throws UserDefinedException {
		try{
			method2();
		}catch(Exception e){
			throw new UserDefinedException();
		}
		
	}
	
	public static void main(String[] args) throws UserDefinedException {
		
		System.out.println("hello");
		/*try{
			method1();
		}catch(ArithmeticException e){
			System.out.println("Cannot divide by zero");
		}*/
		method1();
		System.out.println("hello");
		
	}
}
