package com.varun.dzone.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FpStreamsLambdas {
	public static void lambdasStreams() {
		Map<String, List<String>> phoneDirectory = new HashMap<>();
		phoneDirectory.put("varun belekar", Arrays.asList("9999", "77384"));
		phoneDirectory.put("atok", Arrays.asList("343", "234"));

		phoneDirectory.entrySet().stream().filter(entry -> entry.getKey().contains("varun")).forEach(entry -> {
			System.out.println("Name:  " + entry.getKey());
			entry.getValue().forEach(System.out::println);
		});
		;

		Map<String, List<String>> filteredNumbers = phoneDirectory.entrySet().stream()
				.filter(entry -> entry.getKey().contains("varun"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
	}

	public static void sortingUsingLambda() {

		List<String> cities = Arrays.asList("Milan", "london", "San Francisco", "Tokyo", "New Delhi");
		System.out.println(cities);
		System.out.println("Sorting:");
		cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		cities.forEach(city -> System.out.print(city));
	}

	public static void main(String[] args) {
		sortingUsingLambda();
	}
}
