package com.varun.generics;

import java.util.List;

public class GenericMethod<T> {
	public void printList(List<T> list){
		for (T t : list) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	public static <T> void genericDisplay(T element){
		System.out.println(element.getClass() + " " + element);
	}
	
	public T getElementAtIndex(List<T> list, int index){
		return list.get(index);
	}
}
