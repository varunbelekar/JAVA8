package com.varun.practice;

public interface SampleInterface2 {
	default  void helloWorld() {
		System.out.println("Default hello world from SI2");
	}
	
	static void staticUtility() {
		System.out.println("static utility method");
	}
}
