package com.varun.lazy;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LazyEvaluationDemo {

	public static boolean compute(String str) {
		System.out.println("executing");
		// expensive operation...
		/*
		 * IntStream.range(0, 1000) .forEach(System.out::println);
		 */
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return str.contains("a");

	}

	public static String eagerMatch(boolean a, boolean b) {
		return (a && b) ? "match" : "incompatible";
	}

	public static String lazyMatch(Supplier<Boolean> s1, Supplier<Boolean> s2){
		return (s1.get() && s2.get()) ? "match" : "incompatible";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant start = Instant.now();
		System.out.println("Eager evaluation");
		System.out.println(eagerMatch(compute("bb"), compute("aa")));
		Instant end = Instant.now();
		System.out.println("Time for eager " + Duration.between(start, end));

		start = Instant.now();
		System.out.println("Lazy evaluation");
		System.out.println(lazyMatch(() -> compute("bb"), () -> compute("aa")));
		end = Instant.now();
		System.out.println("Time for lazy " + Duration.between(start, end));
	}

}
