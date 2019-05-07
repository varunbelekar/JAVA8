package com.varun.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test4 {
	
	public static int findSmallestPosNum(List<Integer> list){
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) != i+1){
				return i+1;
			}
		}
		return list.size() + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,1,2,3,4};
		List<Integer> list = new ArrayList();
		
		for(int i : a){
			if(i>0){
				list.add(i);
			}
		}
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(findSmallestPosNum(list));
		
		//System.out.println(min);
	}

}
