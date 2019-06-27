package com.varun.random;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomDemo {
	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			System.out.print(r.nextInt(100)+" ");
		}
		
		//IntStreams
		IntStream st = r.ints(0, 100);
		st.forEach((p) -> System.out.println(p));
	}
}
