package com.varun.lambda;

public class Person {
	private int id;
	private int age;
	private String gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Person(int id, int age, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
