package com.varun.generics;

import java.util.ArrayList;
import java.util.List;

class Test<T> {
	T obj;
	public Test(T obj){
		this.obj = obj;
	}
	
	public T getTestObject(){
		return this.obj;
	}
}

public class GenericDriver{
	public static void main(String[] args) {
		Test t = new Test(15);
		System.out.println(t.getTestObject());
		
		Test t1 = new Test("varun");
		System.out.println(t1.getTestObject());
		
		//Calling generic method
		List<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		GenericMethod genericMethod = new GenericMethod();
		genericMethod.printList(list);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("var");
		list2.add("anu");
		list2.add("aru");
		genericMethod.printList(list2);
		
		GenericMethod.genericDisplay(15);
		GenericMethod.genericDisplay(15.3);
		GenericMethod.genericDisplay("var");
		
		System.out.println(genericMethod.getElementAtIndex(list2, 1));
		
	}
}
