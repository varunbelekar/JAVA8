package com.varun.multithreading;

import java.util.*;

public class MtRealExample{
	public static void main(String[] args) throws Exception{
		int[] a = new int[10];
		Random r = new Random();
		String s  = "1111111111111111111111111111111";
		System.out.println(s.length());
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < a.length; i++){
			addElement(a, r, i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Without Multithreading : " + (endTime - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < a.length / 2; i++){
				addElement(a, r, i);
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = a.length/2; i < a.length; i++){
				addElement(a, r, i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		endTime = System.currentTimeMillis();
		System.out.println("With Multithreading : " + (endTime - startTime) + "ms");
	}
	
	public static void addElement(int[] a, Random r, int index){
		try{
			a[index] = r.nextInt();
			Thread.sleep(100);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
