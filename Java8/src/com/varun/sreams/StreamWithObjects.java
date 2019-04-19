package com.varun.sreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.varun.model.Person;

public class StreamWithObjects {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person(7,"varun","bel")
				,new Person(8,"aru","tok")
				,new Person(9,"aliya","shaik"));
		
		//Filtering Person with id less than 8
		List<Person> filteredList = list.stream()
										.filter(p -> p.getId() >=8)
										.map(p -> p)
										.collect(Collectors.toList());
		for(Person i :filteredList){
			System.out.println(i.toString());
		}
					
		//Alternate approach to filter data
		list.stream()
			.filter(p -> p.getId() >= 8)
			.forEach(p -> System.out.println(p.toString()));
	}

}
