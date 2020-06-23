package com.varun.enumpractice;

public class EnumTest {
	private Day day;
	
	public EnumTest(Day day) {
		this.day = day;
	}
	
	public void tellTypeOfDay() {
		switch (day) {
			case MONDAY:
				System.out.println("Mondays are bad");
				break;
			case TUESDAY:
				System.out.println("Tuesday are ok ok");
				break;
			case FRIDAY:
				System.out.println("Friday are great");
				break;
			case SATURDAY : case SUNDAY:
				System.out.println("Weekends are extraordinary");
				break;
		}
		
	}
	
	public static void main(String[] args) {
		EnumTest monday = new EnumTest(Day.MONDAY);
		monday.tellTypeOfDay();
		
		EnumTest friday = new EnumTest(Day.FRIDAY);
		friday.tellTypeOfDay();
		
		EnumTest saturday = new EnumTest(Day.SATURDAY);
		saturday.tellTypeOfDay();
		
		EnumTest sunday = new EnumTest(Day.SUNDAY);
		sunday.tellTypeOfDay();
	}
}
