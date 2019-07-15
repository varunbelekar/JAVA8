package com.varun.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println("Today : " + sd.format(cal.getTime()));
		cal.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println("Yesterday : " + sd.format(cal.getTime()));
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 3);
		System.out.println("After three days " + sd.format(cal.getTime()));
		cal = Calendar.getInstance();//Always initialize to current time
		cal.set(Calendar.DAY_OF_WEEK, cal.getFirstDayOfWeek());
		System.out.println("First day of week : " + sd.format(cal.getTime()));
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
		System.out.println("First day of month " + sd.format(cal.getTime()));
		System.out.println("Today " + sd.format(cal.getTime()));

	}
}
