package com.varun.practice;

public class Driver implements SampleInterface, SampleInterface2{
	
	public static void main(String[] args) {
		Driver obj = new Driver();
		obj.helloWorld();
		SampleInterface2.staticUtility();
	}

	@Override
	public void helloWorld() {
		SampleInterface2.super.helloWorld();
	}
}
