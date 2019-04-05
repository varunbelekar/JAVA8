package com.varun.javacore;


/**
 * @author vbele
 * This class is used to demonstrate the use of covariant return type in JAva.
 */


class A{
	public A get(){
		return this;
	}
}
class B extends A{
	public B get(){
		return this;
	}
	public void message(){
		System.out.println("In message");
	}
}
public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B().get().message();
		
	}

}
