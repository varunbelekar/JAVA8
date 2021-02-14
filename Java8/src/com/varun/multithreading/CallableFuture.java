package com.varun.multithreading;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		Future<Integer> integerFuture = executorService.submit(() -> {
			Thread.sleep(3000);
			return new Random().nextInt(100);
		});
		System.out.println("some unrelated operations");
		System.out.println(integerFuture.get());//blocking
		executorService.shutdown();
	}
}
