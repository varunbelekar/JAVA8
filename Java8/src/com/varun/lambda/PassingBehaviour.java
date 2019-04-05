package com.varun.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PassingBehaviour {
	
	public static int addList(List<Integer> l,Predicate<Integer> p){
		int sum=0;
		for(Integer i:l){
			if(p.test(i)){
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(21);
		list.add(30);
		System.out.println("Addition of all numbers "+addList(list,p->true));
		System.out.println("Addition of even numbers "+addList(list,p->p%2==0));
		System.out.println("Addtion of all numbers greater than 10 "+addList(list, p->p>10));
		
	}

}
