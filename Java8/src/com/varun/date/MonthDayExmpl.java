package com.varun.date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class MonthDayExmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthDay month=MonthDay.now();
		System.out.println(month);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM");
		System.out.println(month.format(d));
		
		LocalDate d1=month.atYear(1997);
		System.out.println(d1.format(d));
	}

}
