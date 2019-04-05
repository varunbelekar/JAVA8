package com.varun.date;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExampl {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(time.minusMinutes(65));
		
		
		ZoneId z=ZoneId.of("Asia/Kolkata");
		LocalTime time1=LocalTime.now(z);
		System.out.println("Local time of Asia/Kolkata "+time1);
		
	}

}
