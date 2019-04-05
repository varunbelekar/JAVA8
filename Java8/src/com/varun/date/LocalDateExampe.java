package com.varun.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author vbele
 * This class demonstrates the use of LocalDate class in JAva
 */
public class LocalDateExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();//Get the current date.
		LocalDate yesterday=date.minusDays(1);
		LocalDate tomorrow=date.plusDays(1);
		System.out.println("Today "+date);
		System.out.println("Yesterday "+yesterday);
		System.out.println("Tomorrow "+tomorrow);
		
		
		LocalDate date1=LocalDate.of(2008, 2, 22);
		
		System.out.println(date1.isLeapYear());//Check if a year is leap year.
		
		LocalDateTime dateTime=date1.atTime(17, 12, 12);
		System.out.println(dateTime);
		
	}

}
