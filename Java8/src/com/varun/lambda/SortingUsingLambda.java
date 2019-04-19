package com.varun.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.varun.model.Person;

public class SortingUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list=Arrays.asList(new Person(10,"varun","bel")
				,new Person(9,"aru","tok")
				,new Person(8,"www","shaik")
				,new Person(8,"aal","shaik"));
		
		System.out.println("Before sorting");
		for(Person p : list){
			System.out.println(p.toString());
		}
		
		System.out.println("Sorting");
		Collections.sort(list,Comparator.comparingInt(Person::getId)
				.thenComparing(Person::getFirstName)
				);
		for(Person p : list){
			System.out.println(p.toString());
		}
		
		
		
	}

}
