package com.varun.javacore;

class A2{
	int x=5;
	public A2(){
		System.out.println("a2 created");
	}
	public void message(){
		System.out.println("message");
	}
}

class B2 extends A2{
	
	int x=8;
	public B2(){
		super();
		System.out.println("b2 created");
	}
	
	public void message(){
		super.message();//super can be used to invoke parent class method
		System.out.println("b2 x "+x);
		System.out.println("a2 x "+super.x);//super is used to refer immediate parent class instance variable
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 obj=new B2();
		obj.message();
		
	}

}
