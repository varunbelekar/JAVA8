package com.varun.javacore;

/**
 * @author vbele
 * This class demonstrates the use of this keyword in Java
 */

class A1{
	int x;
	int y;
	
	public A1(){
		System.out.println("A1 created");
		
	}
	public A1(int x, int y) {
		this();//this() : to invoke current class constructor
		this.x = x;//This keyword is used to refer current class instance variable
		this.y = y;
	}
	
	public void m(){
		System.out.println("hello m");
		this.n();//this: to invoke current class method
	}
	public void n(){
		System.out.println("hello n");
	}
	
}
public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj1=new A1(1,2);
		
	}

}
