package com.varun.sreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilteringStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = IntStream.rangeClosed(1, 10).toArray();
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Filtering even numbers

		int b[] = Arrays.stream(a).filter(p -> p % 2 == 0).toArray();

		Arrays.stream(a)
			  .filter(p -> p%2 == 0)
			  .forEach(p -> System.out.print(p+" "));
		/*
		 * for(int i : b){ System.out.print(i+" "); }
		 */
				System.out.println();
		// Sum of all even numbers
		int sum = Arrays.stream(a).filter(p -> p % 2 == 0).sum();
		System.out.println(sum);

		// Average of even numbers

		Arrays.stream(a).filter(p -> p % 2 == 0).average().ifPresent(System.out::println);

		// case where there are no even numbers
		int b1[] = { 3, 5, 7 };
		Arrays.stream(b1).filter(p -> p % 2 == 0).average().ifPresent(System.out::println);

	}

}
