package com.varun.regex;

import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		String name = "Ryan Bøgelund";
		System.out.println("Original Name: "+name);
		String regex = "[^a-zA-Z]";//   Also [\\W]
		name  = name.replaceAll(regex, "");
		System.out.println("After removing special characters: "+name);
		
		
		System.out.println("([a-z]+ : Arun) =>" + Pattern.matches("[a-z]+", "arun"));
		System.out.println("([a-z] : Arun) =>" + Pattern.matches("[a-z]", "arun"));
		System.out.println("([a-z] : a) =>" + Pattern.matches("[a-z]", "a"));
		System.out.println("([a-z0-9]* : aru) =>" + Pattern.matches("[a-z0-9]*", "aru"));
		System.out.println("([a-z]{3} : aruj) =>" + Pattern.matches("[a-z]{3}", "aruj"));
		System.out.println("([a-z]{3,6} : varun) =>" + Pattern.matches("[a-z]{3,6}", "varun"));
		System.out.println("([a-z]{3,6} : varunaa) =>" + Pattern.matches("[a-z]{3,6}", "varunaa"));
		
	}
}
