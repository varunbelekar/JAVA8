package com.varun.multithreading;

public class SyncDemo{
	int counter;
	
	public synchronized void increment(){
		counter++;
	}
	
	public static void main(String[] args) throws InterruptedException{
		SyncDemo obj = new SyncDemo();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 1000; i++){
				obj.increment();
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 1000; i++){
				obj.increment();
			}
		});
		t1.start();
		t2.start();	
		t1.join();
		t2.join();	
		System.out.println(obj.counter);
	}
}
