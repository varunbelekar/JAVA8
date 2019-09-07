package com.varun.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchPerson {
	
	private static List<Person> getPersonLessThanAge(List<Person> list, int age) {
		List<Person> roaster = new ArrayList();
		for (Person person : list) {
			if(person.getAge() < age) {
				roaster.add(person);
			}
		}
		return roaster;
	}
	private static List<Person> getPersonGreaterThanAge(List<Person> list, int age) {
		List<Person> roaster = new ArrayList();
		for (Person person : list) {
			if(person.getAge() > age) {
				roaster.add(person);
			}
		}
		return roaster;
	}
	
	private static List<Person> getPersonByGender(List<Person> list, String gender) {
		List<Person> roaster = new ArrayList();
		for (Person person : list) {
			if(gender.equals(person.getGender())) {
				roaster.add(person);
			}
		}
		return roaster;
	}
	
	private static List<Person> getPersonByCriteria(List<Person> list, Predicate<Person> predicate){
		List<Person> roaster = new ArrayList();
		for (Person person : list) {
			if(predicate.test(person)) {
				roaster.add(person);
			}
		}
		return roaster;
	}
	
	public static void main(String[] args) {
		List<Person> roaster = new ArrayList();
		roaster.add(new Person(7, 22, "male"));
		roaster.add(new Person(8, 21, "female"));
		roaster.add(new Person(9, 24, "female"));
		roaster.add(new Person(10, 25, "male"));
		System.out.println("getPersonByGender");
		getPersonByGender(roaster, "male").stream().forEach((person)->System.out.println(person.toString()));
		System.out.println("getPersonGreaterThanAge");
		getPersonGreaterThanAge(roaster, 20).stream().forEach(System.out::println);
		System.out.println("getPersonLessThanAge");
		getPersonLessThanAge(roaster, 25).forEach(System.out::println);
		
		System.out.println("getPersonByCriteria:Gender");
		getPersonByCriteria(roaster, (person) -> "male".equals(person.getGender())).forEach(System.out::println);
		System.out.println("getPersonByCriteria: Greater than age");
		getPersonByCriteria(roaster, (person) -> person.getAge() > 20).forEach(System.out::println);
		System.out.println("getPersonByCriteria: Less than age");
		getPersonByCriteria(roaster, (person) -> person.getAge() < 25).forEach(System.out::println);
	}
}
