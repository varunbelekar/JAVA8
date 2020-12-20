package com.varun.test;

public class Test1 {                               
	
	public static void main(String[] args) {
		/*
		 * A objA = new A(5); objA.printX();
		 */
		B objB = new B(5, 10);
		objB.printY();
	}
	
}

class A{
	private int x;
	
	public A(int x) {
		this.x = x;
		System.out.println("Parent class constructor");
	}

	public void printX() {
		System.out.println("X := " + this.x);
	}
}

class B extends A{
	private int y;

	public B(int x, int y) {
		super(x);
		this.y = y;
		System.out.println("Child class constructor");
	}
	
	public void printY() {
		super.printX();
		System.out.println("Y :=" + this.y);
	}
}
