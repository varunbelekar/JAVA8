package com.varun.sreams;

import java.util.stream.IntStream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Gernerating numbers from 1 to 50
		int a[]=new int[50];
		for(int i=0;i<50;i++){
			a[i]=i+1;
		}
		for(int i : a){
			System.out.print(i+" ");
		}
		System.out.println();
		//Using Streams
		int b[]=IntStream.rangeClosed(-50, -1).toArray();
		for(int i : b){
			System.out.print(i+" ");
		}
	}

}
