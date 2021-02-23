package com.varun.multithreading;

public class TimeOutATherad {
	
	public static void main(String[] args) throws InterruptedException {
		MyTask task = new MyTask();
		//create task and submit to thread
		Thread t1 = new Thread(task);
		t1.start();
		
		//Timeout for 1 seconds
		Thread.sleep(1000);
		
		//ask task to stop using volatile
		task.keepRunning = false;
	}
}

class MyTask implements Runnable{
	volatile boolean keepRunning = true;
	@Override
	public void run() {
		while(keepRunning) {
			System.out.println("hello");
		}
	}
}
