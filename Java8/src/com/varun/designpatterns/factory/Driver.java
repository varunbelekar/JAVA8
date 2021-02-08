package com.varun.designpatterns.factory;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PlanFactory planFactory = new PlanFactory();
		
		
		System.out.println("Enter plan type"); 
		String planType = scanner.next();
		System.out.println("Enter billing units"); 
		int billingUnits = scanner.nextInt();
		
		
		//System.out.println("Your bill : " + plan.calculateBill(1000));
	}
}
