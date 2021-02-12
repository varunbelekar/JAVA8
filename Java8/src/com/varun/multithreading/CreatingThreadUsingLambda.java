package com.varun.multithreading;

public class CreatingThreadUsingLambda{
	public static void main(String[] args) throws InterruptedException{
	
		CreatingThreadUsingLambda obj = new CreatingThreadUsingLambda();
		Thread t1 = new Thread(obj::printHi);
		Thread t2 = new Thread(obj::printHello);
		System.out.println("Using method References");
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());		
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Using lambdas");
		Thread t3 = new Thread(() -> {
			for(int i = 0; i < 5; i++){
			System.out.println("Hi from lambads");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
			
			}
		});
		Thread t4 = new Thread(() -> {
			for(int i = 0; i < 5; i++){
			System.out.println("Hello from lambdas");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
			
			}
		});
		t3.start();
		t4.start();
	}
	
	public void printHi(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hi");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
			
		}
	}
	public void printHello(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
			
		}
	}
}

