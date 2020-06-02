package com.varun.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CountingElements {
	public static <T> void countElementsByCriteria(Collection<T> collection, Predicate<T> criteria){
		System.out.println(collection.stream().filter(criteria).count());
	}
	
	public static <T> void swapElements(T[] array, int pos1, int pos2){
		T temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
		Stream.of(array).forEach(System.out::println);
	}
	
	public static <T extends Comparable<T>> Optional<T> findMax(List<T> elements){
		return elements.stream().max(T::compareTo);
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(2, 4, 5, 7);
		System.out.println("#####Count element by criteria");
		countElementsByCriteria(integerList, i -> i % 2 != 0);
		
		Set<String> names = new HashSet<>();
		names.addAll(Arrays.asList("varun", "vav", "vini", "aba"));
		countElementsByCriteria(names, name -> new StringBuilder(name).reverse().toString().equalsIgnoreCase(name));
		
		System.out.println("#####Swap elements###");
		swapElements(new Integer[]{7, 8, 9},  0, 2);
		
		System.out.println("#####Max Element in a list");
		System.out.println(findMax(Arrays.asList(3, 4, 5)).get());
	}
}
