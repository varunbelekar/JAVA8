package com.varun.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Test {
	
	static int[] stones(int n, int a, int b) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		int temp = 0, smallest = 0;
		for (int i = 0; i < n - 1; i++) {
			smallest += a;
		}
		System.out.println("smallest " + smallest);
		if(a > b){
			temp = a;
			a = b;
			b = temp;
		}
		
		for(int i = 0; i < n - 1 ; i++){
			int j = queue.size();
			while(j > 0){
				if(!queue.contains(queue.peek() + a))
					queue.add(queue.peek() + a);
				if(!queue.contains(queue.peek() + b))
					queue.add(queue.peek() + b);
				if(queue.peek() != smallest)
					queue.remove();
				j--;
				System.out.println("Queue state ");
				for (Integer integer : queue) {
					System.out.print(integer + " ");
				}
				System.out.println("Queue peek " + queue.peek());
				System.out.println("*******");
			}
		}
		
		int[] arr = new int[queue.size()];
		int j = 0;
		for (Integer i : queue) {
			arr[j++] = i;
		}
		return arr;
    }
	
	public static void sumOld(int a, int b, int limit){
		long  sum = 0;
		for (long i = (a < b)? a : b; i < limit; i++) {
			if(i % a == 0){
				sum += i;
			}
			else if(i % b == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	} 
 

	
	public static void sum(int a, int b, int limit){
		long  sum = 0;
		for (long i = a,j = b; i < limit || j < limit; i+=a, j+=b) {
			if(i < limit ){
				sum +=i;
			}
			if(j < limit && j%a != 0 ){
				sum +=j;
			}
				
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) throws Exception {
		sum(22, 5, 455);
		sumOld(22, 5, 455);
	}
}
