package com.varun.generics;

import java.util.ArrayList;
import java.util.Arrays;
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
	public static void boundedParameters(){
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		GenericMethod<Integer> genericMethod = new GenericMethod<>();
		System.out.println(genericMethod.findElementsGreaterThan(numbers, 3));
	}
	
	public static void wildCardsUpperBounded(){
		List<Double> list = Arrays.asList(1D, 2D);
		GenericMethod.wildCardsUpperBounded(list);
	}
	
	public static void wildCardsUnBounded(){
		List<String> list = Arrays.asList("varun", "vini");
		GenericMethod.wildCardsUnBounded(list);
	}
	
	public static void wildCardsLowerBounded(){
		List<Object> objectList = Arrays.asList("varun", "vini");
		GenericMethod.wildCardsLowerBound(objectList);
		
		List<Number> numberList = Arrays.asList(4, 5);
		GenericMethod.wildCardsLowerBound(numberList);
		
		List<Integer> integerList = Arrays.asList(4, 5);
		GenericMethod.wildCardsLowerBound(integerList);
	}
	
	public static void main(String[] args) {
		/*Test t = new Test(15);
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
		
		System.out.println(genericMethod.getElementAtIndex(list2, 1));*/
		
		
		/*Box<Integer> boxOfInteger = new Box<Integer>(4);
		System.out.println(boxOfInteger.getT());
		
		Box<String> boxOfString = new Box<>("Varun");
		
		IntegerBox<Integer> integerBox = new IntegerBox<Integer>(5);
		System.out.println(integerBox.getInteger());*/
		
		//IntegerBox<Integer> integerBox = new IntegerBox<Integer>("String");Compile error
		
		//boundedParameters();
		
		//wildCardsUnBounded();
		
		wildCardsLowerBounded();
	}
}
