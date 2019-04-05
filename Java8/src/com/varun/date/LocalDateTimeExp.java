package com.varun.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime d=LocalDateTime.now();
		System.out.println("Before formatting "+d);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("After formatiing "+d.format(format));
	}

}
