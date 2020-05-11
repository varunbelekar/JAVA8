package com.varun.sreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreams {
	
	public static void flatMapDemo(){
		List<List<String>> namesNested = Arrays.asList( 
			      Arrays.asList("Jeff", "Bezos"), 
			      Arrays.asList("Bill", "Gates"), 
			      Arrays.asList("Mark", "Zuckerberg"));
		
		List<String> namesFlatStream = namesNested.stream()
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
		
		namesFlatStream.forEach(System.out::println);
	}
	public static void main(String[] args) {
		flatMapDemo();
	}
}
