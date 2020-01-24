package com.varun.sreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private int id;
	private String name;
	private int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}


public class StreamDzone {
	public static void creatingStreamOfIntegers(){
		Integer[] x = {1, 2, 4, 3, 1};
		List<Integer> list = Arrays.asList(x);
		
		Stream.of(x)
			  .forEach(System.out::println);
		
		list.stream()
			.forEach(System.out::println);
	}
	
	public static void mapAndFilterCollectUsingStream(){
		List<Employee> empList = getEmployees();
		
		List<Integer> list = empList.stream()
				.filter(e -> e.getAge() > 20)
				.sorted(Comparator.comparing(Employee::getAge))
				.map(e -> e.getAge())
				.collect(Collectors.toList());
		System.out.println(list);
				
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(7, "varun", 23));
		employeeList.add(new Employee(8, "aru", 22));
		employeeList.add(new Employee(8, "aaru", 22));
		employeeList.add(new Employee(1, "saurabhi", 25));
		employeeList.add(new Employee(2, "bhali", 10));
		
		return employeeList;
	}
	
	public static void creatingStreamOfEmployees(){
		List<Employee> employeeList = getEmployees();
		//Incrementing age by 1
		employeeList.stream()
				    .forEach(e -> e.setAge(e.getAge() + 1));
		
		//Printing 
		System.out.println("Before Sorting:");
		employeeList.stream()
					.forEach(System.out::println);
		
		//Counting the no of elements
		System.out.println(employeeList.stream()
					.count());
		
		employeeList.sort((a, b) -> {
			return a.getId() == b.getId() ?
					a.getName().compareTo(b.getName()) :
						Integer.compare(a.getId(), b.getId());
		});
		
		System.out.println("After Sorting:");
		//Sorting elements
		employeeList.stream()
					.sorted(Comparator.comparing(Employee::getId)
					.thenComparing(Comparator.comparing(Employee::getName)))
					.forEach(System.out::println);
		
		
	}
	
	public static void main(String[] args) {
		//creatingStreamOfIntegers();
		//creatingStreamOfEmployees();
		mapAndFilterCollectUsingStream();
	}
}
