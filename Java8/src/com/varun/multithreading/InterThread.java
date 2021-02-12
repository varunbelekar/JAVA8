package com.varun.multithreading;

public class InterThread{
	public static void main(String[] args){
		System.out.println("Hello");
		Q q = new Q();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
	}
}

class Q{
	int num;
	
	public void setNum(int num){
		this.num = num;
	}
	
	public int getNum(){
		return num;
	}
}

class Producer implements Runnable{
	Q q;
	
	public Producer(Q q){
		this.q = q;
		Thread t = new Thread("Producer");
		t.start();
		
	}
	public void run(){
		int i = 0;
		while(true){
			q.setNum(i);
			i++;
			System.out.println("Setting num : " + q.getNum());
		}
	}
}

class Consumer{
	Q q;
	
	public Consumer(Q q){
		this.q = q;
		Thread t = new Thread("Producer");
		t.start();
		
	}
	public void run(){
		int i = 0;
			while(true){
				System.out.println("Get Num : " + q.getNum());
			}
	}
}
