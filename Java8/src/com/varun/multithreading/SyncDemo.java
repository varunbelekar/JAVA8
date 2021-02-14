package com.varun.multithreading;

public class SyncDemo{
	int counter;
	
	public synchronized void increment(){
		counter++;
		System.out.println("Incremented counter : " + Thread.currentThread().getName());
	}
	
	public synchronized void decrement() {
		counter--;
		System.out.println("Decremented counter : "  + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) throws InterruptedException{
		SyncDemo obj = new SyncDemo();
		
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < 100; i++){
				obj.increment();
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 100; i++){
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
