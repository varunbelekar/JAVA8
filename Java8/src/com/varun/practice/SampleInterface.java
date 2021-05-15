package com.varun.practice;

public interface SampleInterface {
	default  void helloWorld() {
		System.out.println("Default hello world from SI1");
	}
}
