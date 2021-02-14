package com.varun.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		long startTime = System.currentTimeMillis();
		List<CompletableFuture<String>> futures = new ArrayList<CompletableFuture<String>>();
		for (int i = 0; i < 10; i++) {
			CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
				try {
					Thread.sleep(1000);
					System.out.println("Computing from thread : " + Thread.currentThread().getName());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return new Random().nextInt(100);
			}).thenApply(integer -> Integer.toString(integer));//give callback methods
			futures.add(completableFuture);
		}
		
		for (CompletableFuture<String> completableFuture2 : futures) {
			System.out.println(completableFuture2.get());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("Time for execution : " + (endTime - startTime));
	}
}
