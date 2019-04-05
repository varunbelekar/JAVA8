package com.varun.date;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		String format=DateFormat.getInstance().format(d);
		System.out.println(format);
	}

}
