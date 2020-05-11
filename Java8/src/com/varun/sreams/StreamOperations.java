package com.varun.sreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.varun.model.Person;

public class StreamOperations {
	static Person[] personArray = new Person[2];
	static {
		 personArray[0] = new Person(7, "varun", "bel");
		 personArray[1] = new Person(8, "vini", "pal"); 		
	}
	
	public static void IntStreams(){
		List<Person> personList = Arrays.asList(personArray);
		personList.stream()
				  .peek(person -> person.setId(person.getId() * 2))
				  .mapToInt(Person::getId)
				  .forEach(System.out::println);
	}
	
	public static void streamPeek(){
		List<Person> personList = Arrays.asList(personArray);
		personList.stream()
				  .peek(System.out::println)
				  .peek(person -> person.setId(99))
				  .forEach(System.out::println);
		
	}
	
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
		//flatMapDemo();
		//streamPeek();
		IntStreams();
	}
}
