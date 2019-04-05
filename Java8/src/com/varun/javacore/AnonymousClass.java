package com.varun.javacore;


abstract class Person{
	abstract public void eat();
	
}

class P1 extends Person{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("PErson is eating");
	}
	
}

interface Animal{
	public void eat();
	public void run();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Person is eating");
			}
			
		};
		p.eat();
		
		
		Animal a=new Animal() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Animal is running");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Animal is running");
			}
		};
		a.run();
	}

}
