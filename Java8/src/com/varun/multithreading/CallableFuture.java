package com.varun.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class CallableFuture {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		long startTime = System.currentTimeMillis();
		List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
		for (int i = 0; i < 10; i++) {
			Future<Integer> integerFuture = executorService.submit(() -> {
				Thread.sleep(1000);
				return new Random().nextInt(100);
			});
			futures.add(integerFuture);
		}
		List<Integer> list = futures.stream()
									.map(CallableFuture::getFutureInteger)
									.collect(Collectors.toList());
		System.out.println(list);
		long endTime = System.currentTimeMillis();
		System.out.println("Time for execution : " + (endTime - startTime));
		
		executorService.shutdown();
	}
	
	public static Integer getFutureInteger(Future<Integer> future){
		try{
			return future.get();
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
}
