package com.varun.designpatterns.factory;

public abstract class Plan {
	protected double rate;
	
	public double calculateBill(int billingUnits) {
		return rate * billingUnits;
	}
}
