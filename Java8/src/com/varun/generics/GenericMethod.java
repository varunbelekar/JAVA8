package com.varun.generics;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class GenericMethod<T> {
	public void printList(List<T> list){
		/*for (T t : list) {
			System.out.print(t + " ");
		}
		System.out.println();*/
		list.stream().forEach(this::printElement);
	}
	public void printElement(T element){
		System.out.print(element + " ");
	}
	
	public static <T> void genericDisplay(T element){
		System.out.println(element.getClass() + " " + element);
	}
	
	public T getElementAtIndex(List<T> list, int index){
		return list.get(index);
	}
	
	public static <T extends Comparable<T>> long findElementsGreaterThan(List<T> list, T element){
		return list.stream()
				   .filter(compareElement(element))
				   .count();
	}
	
	private static <T extends Comparable<T>> Predicate<? super T> compareElement(T element) {
		return currentElement -> currentElement.compareTo(element) > 0 ? true : false;
	}
	
	public static void wildCardsUpperBounded(List<? extends Number> list){
		list.forEach(System.out::println);
	}
	
	public static  void wildCardsUnBounded(List<?> list){
		list.forEach(System.out::println);
	}
	
	public static void wildCardsLowerBound(List<? super Integer> list){
		list.forEach(System.out::println);
	}
}
