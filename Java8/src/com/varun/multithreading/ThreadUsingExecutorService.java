package com.varun.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadUsingExecutorService {
	public static void main(String[] args) {
		int numberOfCores = Runtime.getRuntime().availableProcessors();
		System.out.println("Available Processors : " + numberOfCores);
		
		//Fixed Thread Pool
		ExecutorService executorService = Executors.newFixedThreadPool(numberOfCores);
		
		//Cached Thread Pool
		//ExecutorService cachExecutorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			System.out.println("From : " + Thread.currentThread().getName());
			executorService.execute(() -> System.out.println("Thread name: " + Thread.currentThread().getName()));
		}
		System.out.println("ENded");
		executorService.shutdown();
	}
}
