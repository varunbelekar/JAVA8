package com.varun.sreams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.varun.model.Person;

public class StreamOperations {
	static Person[] personArray = new Person[3];
	static {
		 personArray[0] = new Person(7, "Varun", "bel");
		 personArray[1] = new Person(8, "Aini", "pal"); 
		 personArray[2] = new Person(9, "Vini", "pal"); 
	}
	
	public static void IntStreams(){
		List<Person> personList = Arrays.asList(personArray);
		personList.stream()
				  .mapToInt(Person::getId)
				  .max();
		
		OptionalInt max = IntStream.range(0, 5)
				 				   .max();
		System.out.println(max);
	}
	
	public static void partitionStreams(){
	    List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
		Map<Boolean, List<Integer>> map = 
		 intList.stream()
				.collect(Collectors.partitioningBy(number -> number % 2 == 0));
		printMap(map);
	}
	
	public static void groupByStreams(){
		List<Person> personList = Arrays.asList(personArray);
		Map<Character, List<Person>> map = personList.stream()
				.collect(Collectors.groupingBy(groupByFirstCharacterOfFirstName()));
		printMap(map);
		
		Map<Character, List<Integer>> map1 = personList.stream().collect(Collectors.groupingBy(
				groupByFirstCharacterOfFirstName(), Collectors.mapping(Person::getId, Collectors.toList())));
		
		printMap(map1);
	}

	private static Function<? super Person, ? extends Character> groupByFirstCharacterOfFirstName() {
		return person -> new Character(person.getFirstName().charAt(0));
	}
	
	public static void specialOperations(){
		List<Person> personList = Arrays.asList(personArray);
		OptionalDouble averageId = personList.stream()
				  .mapToDouble(Person::getId)
				  .average();
		System.out.println(averageId.getAsDouble());
	}
	
	public static <T, U> void printMap(Map<T, U> map){
		map.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
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
		//IntStreams();
		//specialOperations();
		groupByStreams();
		//partitionStreams();
	}
}
