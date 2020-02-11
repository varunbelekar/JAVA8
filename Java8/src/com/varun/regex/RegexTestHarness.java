package com.varun.regex;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class RegexTestHarness {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    	while (true) {
        	System.out.println("Enter you regex");
        	String regex = sc.nextLine();
            Pattern pattern = Pattern.compile(regex);
            
            System.out.println("Enter input string");
            String input = sc.nextLine();
            Matcher matcher = 
            pattern.matcher(input);

            boolean found = false;
            while (matcher.find()) {
                System.out.format("I found the text" +
                    " \"%s\" starting at " +
                    "index %d and ending at index %d.%n",
                    matcher.group(),
                    matcher.start(),
                    matcher.end());
                found = true;
            }
            if(!found){
                System.out.format("No match found.%n");
            }
        }
    }
}
