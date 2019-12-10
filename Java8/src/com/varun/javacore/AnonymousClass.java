package com.varun.javacore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		Integer localVariable1 = 10;
	    Integer localVariable2 = 10;
	    Integer localVariable3 = 10;
	    Map<String, Integer> map = new HashMap<String, Integer>() {
	      {
	        put("a", localVariable1);
	        put("b", localVariable2);
	        put("c", localVariable3);
	      }
	    };
	    
	    List<Integer> list = new ArrayList<Integer>(){
	    	{
	    		add(3);
	    		add(5);
	    	}
	    };
	    list.forEach(System.out::println);
	}

}
