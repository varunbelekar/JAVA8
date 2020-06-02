package com.varun.model;

import java.util.Comparator;

public class IdComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return (o1.getId() > o2.getId())? 1 : -1;
	}

}
