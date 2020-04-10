package com.varun.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d.toString());
		String format=DateFormat.getInstance().format(d);
		System.out.println(format);
		
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println(sd.format(date));
		
		//String query  = "INSERT INTO LDAP_DELETE_STATUS VALUES(TO_DATE('" + sd.parse(sd.format(date)) + "'),'SUCCESS')";
		System.out.println(sd.parse(sd.format(date)));
		
		
	}

}
