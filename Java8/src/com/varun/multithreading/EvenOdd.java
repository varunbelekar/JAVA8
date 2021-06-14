package com.varun.multithreading;

public class EvenOdd {
	int counter = 1;
	int max = 10;
	static boolean odd;
	public static void main(String[] args) {
		EvenOdd objEvenOdd = new EvenOdd();
		Thread even = new Thread(objEvenOdd::printEven);
		Thread odd = new Thread(objEvenOdd::printOdd);
		
		even.start();
		odd.start();
	}
	
	public void printEven() {
		synchronized (this) {
			while (counter < max) {
				while (counter % 2 != 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread : " + counter++);
				notify();
			}
		}
	}
	
	public void printOdd() {
		synchronized (this) {
			while (counter < max) {
				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd thread : " + counter++);
				notify();
			}
		}
	}
}
