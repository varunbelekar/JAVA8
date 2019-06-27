package com.varun.regex;

public class RegexDemo {
	public static void main(String[] args) {
		String name = "Ryan Bøgelund";
		System.out.println("Original Name: "+name);
		String regex = "[^a-zA-Z]";//   Also [\\W]
		name  = name.replaceAll(regex, "");
		System.out.println("After removing special characters: "+name);
		
	}
}
