package com.varun.functionalinterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DriverClass {
	
	public static void supplierInterface(){
		//Use case for Supplier is defining logic for sequence generation and lazy evaluation.
		int[] fib = {0, 1};
		Stream<Integer> stream = Stream.generate(() -> {
			int result = fib[1];
			int fib3 = fib[0] + fib[1];
			fib[0] = fib[1];
			fib[1] = fib3;
			return result;
		});
		stream.forEach((i) -> {
			if(i < 30){
				System.out.println(i);
			}
			else {
				System.exit(0);
			}
		});
		 
		 Stream<Integer> stream1 = Stream.generate(() -> new Random().nextInt(35));
		 stream1.forEach((i) -> {
				if(i < 30){
					System.out.println(i);
				}
				else {
					System.exit(0);
				}
			});
	}
	
	public static void predicateInterface(){
		Predicate<String> predicate = s -> s.contains("ar");
		System.out.println(predicate.test("varun"));
		
		/* A typical use case of the Predicate lambda is to filter a collection of values:*/
		
		List<String> names = Arrays.asList("varun", "anu", "moha", "satendar");
		names.stream()
			 .filter(s -> s.length() < 5)
			 .forEach(System.out::println);
		
	}
	
	public static void acceptInteger(Integer i){
		System.out.println(i + 1);
	}
	
	public static void lambdaMethodRef(){
		int n = 25;
		SquareRoot sr = Math::sqrt;
		SquareRoot sr1 = s -> Math.sqrt(s);
		System.out.println(sr.squareRoot(36));
	}
	
	public static void functionInterface(){
		Function<Integer, String> function = Object::toString;
		System.out.println(function.apply(20));
	}
	
	public static void consumerInterface(){
		Consumer<Integer> consumer = DriverClass::acceptInteger;
		consumer.accept(20);
		
		Consumer<String> stringConsumer = s -> System.out.println(s);
		stringConsumer.accept("Varun");
		
		IntConsumer intCounsumer = i -> System.out.println(i + 100);
		intCounsumer.accept(15);
		
		Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Freddy", 24);
		ages.put("Samuel", 30);
		ages.forEach((name, age) -> System.out.println("Name: " + name + " Age: " + age));
	}
	
	public static void functionInterfaceInMap(){
		Map<String, Integer> map = new HashMap<>();
		map.put("varun", 5);
		System.out.println(map.computeIfAbsent("aru", s -> s.length()));
		System.out.println(map.computeIfAbsent("arun", String::length));
	}
	
	
	public static void main(String[] args) {
		//functionInterfaceInMap();
		//functionInterface();
		
		//consumerInterface();
		//supplierInterface();
		predicateInterface();
	}
}
