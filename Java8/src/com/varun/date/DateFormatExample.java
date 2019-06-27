package com.varun.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		String format=DateFormat.getInstance().format(d);
		System.out.println(format);
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sd.format(date));
		
		
	}

}
