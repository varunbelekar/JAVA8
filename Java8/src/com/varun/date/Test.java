package com.varun.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

interface Add{
	public int add(int x, int y);
}
public class Test {
	public static void main(String[] args){
		String s = "UPPER(substr(role , 1 , 2) || task_info) AS Taskinfo,";
		System.out.println(s.toUpperCase());
	}
}
