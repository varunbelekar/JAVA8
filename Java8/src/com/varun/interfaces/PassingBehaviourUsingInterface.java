package com.varun.interfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.varun.model.Person;

public class PassingBehaviourUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person(7, "varun", "bel"), new Person(8, "anu", "sin"),
				new Person(9, "ish", "sha"));
		PassingBehaviourUsingInterface.printCondtionally(people,new Condition(){

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstName().startsWith("a");
			}
			
		});
		
		//PassingBehaviourUsingInterface.printCondtionally(people, p1->p1.getFirstName().startsWith("v"));

	}
	
	public static void printCondtionally(List<Person> l,Condition c){
		for(Person i:l){
			if(c.test(i)){
				System.out.println(i.toString());
			}				
		}
	}

}

interface Condition{
	public boolean test(Person p);
}


