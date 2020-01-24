package com.varun.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) throws ParseException {
		String date = "01.07.2019";
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(sd.parse(date));
		Date d = new Date();
		System.out.println(sd.format(d));
	}
}
