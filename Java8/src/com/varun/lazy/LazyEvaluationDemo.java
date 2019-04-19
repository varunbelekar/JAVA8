package com.varun.lazy;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LazyEvaluationDemo {
	
	public static boolean compute(String str){
		System.out.println("executing");
		//expensive operation...
		IntStream.range(0, 1000000)
			.forEach(System.out::println);
		
		return str.contains("a");
		
	}
	
	public static String eagerMatch(boolean a,boolean b){
		return (a && b)?"match" : "incompatible";
	}
	
	public static String lazyMatch(Supplier<Boolean> a,Supplier<Boolean> b){
		return a.get() && b.get() ? "match" : "incompatible!";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Eager evaluation");
//		System.out.println(eagerMatch( compute("bb"),compute("aa") ));
		
		System.out.println("Lazy evaluation");
		System.out.println(lazyMatch(()->compute("bb"), ()->compute("aa")));
	}

}
