package com.varun.exceptions;

public class UserDefinedException extends Exception {
	public UserDefinedException(){
		System.out.println("Cannot divide by zero");
	}
	public String getMessage(){
		return "Cannot divide by zero";
	}
}
