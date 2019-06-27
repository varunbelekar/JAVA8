package com.varun.date;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.GregorianCalendar;

public class TimeStamp {
	public static void main(String[] args) {
		Timestamp ts = new Timestamp(new GregorianCalendar(2019, 5, 27 , 19 , 47 ,30).getTimeInMillis());
		System.out.println(ts.toString());
		
		Date d = new Date(ts.getTime());
		System.out.println(d.toString());

	}
}
