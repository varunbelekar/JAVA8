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
		Add addition = (x, y) -> x - y;
		System.out.println(addition.add(5, 4));
	}
}
