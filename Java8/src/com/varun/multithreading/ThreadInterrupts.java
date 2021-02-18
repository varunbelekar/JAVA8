package com.varun.multithreading;

public class ThreadInterrupts {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				if (Thread.currentThread().isInterrupted()) {
					System.out.println("Stopping the task");
					return;
				}
			}
		});

		t1.start();
		t1.interrupt();
	}
}
