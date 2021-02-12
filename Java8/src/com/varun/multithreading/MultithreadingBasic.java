package com.varun.multithreading;

public class MultithreadingBasic{
	public static void main(String[] args){
		//Creating thread my extending thread class.
		Thread t1 = new Hii();
		Thread t2 = new Helloo();
		t1.start();
		t2.start();
	}	
}

class Hii extends Thread{
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hi");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
			
		}
	}
}

class Helloo extends Thread{
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("Hello");
			try{
				Thread.sleep(1000);	
			}catch(Exception e){}
		}
	}
}


