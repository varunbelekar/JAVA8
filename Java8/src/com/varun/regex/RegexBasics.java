package com.varun.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("[a-z]");
		Matcher m = p.matcher("sjkhgjk");
		System.out.println(m.matches());

		// Alternatively
		System.out.println(Pattern.matches("[amn]+", "a"));

		System.out.println("X? quantifier : X appers once or not at all");
		System.out.println(Pattern.matches("[a-z]", "amn"));

		String s = "amn";
		System.out.println(s.replaceAll("[a-z]", "g"));

	}
}
