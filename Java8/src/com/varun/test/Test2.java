package com.varun.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
	
	public static boolean checkSum(int a[],int k){
		Set<Integer> set = new HashSet();
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		
		for(int i=0;i<a.length;i++){
			if(set.contains(k-a[i])){
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={3,7,10,15};
		int k = 13;
		
		
		boolean b=checkSum(a, k);
		System.out.println(b);
	}

}
