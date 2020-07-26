package com.varun.java8date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

public class Java8DateTimeApi {
	private static final DateTimeFormatter STD_DATE_FORMAT = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	
	public static void todayDate(){
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today.format(STD_DATE_FORMAT));
	}
	
	public static void yesterdayDate(){
		LocalDate yesterdaay = LocalDate.now().minusDays(1L);
		System.out.println("Yesterday : " + yesterdaay.format(STD_DATE_FORMAT));
	}
	
	public static void tomorrowDate(){
		LocalDate tomorrow = LocalDate.now().minusDays(-1L);
		System.out.println("Tomorrow : " + tomorrow.format(STD_DATE_FORMAT));
	}
	
	public static void firstDayOfNextYear(){
		LocalDate firstDayOfNextYear = LocalDate.now()
										.withDayOfMonth(1)
										.withMonth(1)
										.withYear(Year.now().getValue() + 1);
		System.out.println("First Day of Next year : " + firstDayOfNextYear.format(STD_DATE_FORMAT));
	}
	
	public static void firstDayOfMonth(){
		LocalDate fistDayOfMonth = LocalDate.now()
											.withDayOfMonth(1);
		System.out.println("FirstDayOfTheMonth : " + fistDayOfMonth.format(STD_DATE_FORMAT));
	}
	
	public static void firstDayOfNextMonth(){
		LocalDate fistDayOfNextMonth = LocalDate.now()
											.withDayOfMonth(1)
											.minusMonths(-1L);
		System.out.println("FirstDayOfTheMonth : " + fistDayOfNextMonth.format(STD_DATE_FORMAT));
	}
	
	public static void firstDayOfWeek(){
		LocalDate fistDayOfWeek = LocalDate.now()
										   .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
		System.out.println("First Day Of The Week : " + fistDayOfWeek.format(STD_DATE_FORMAT));
	}
	
	public static void main(String[] args) {
		todayDate();
		yesterdayDate();
		tomorrowDate();
		firstDayOfNextYear();
		firstDayOfMonth();
		firstDayOfNextMonth();
		firstDayOfWeek();
	}
}
