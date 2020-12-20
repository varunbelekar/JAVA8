package com.varun.dynamicprog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author varun
 * 
 * This class implements the CanSum problem.
 * The goal is to return a boolean indicating whether it 
 * is possible to generate the target sum using the numbers 
 * from the array.
 * You may use elements from the array as many times.
 * You may assume that all the elements are non negative. 
 */
public class CanSum {
	/**
	 * TimeComplexity O(n^m)
	 * Space Complexity O(m)
	 * where n : number of elements in array
	 * m: target(No of levels or height)
	 * @param arr
	 * @param target
	 * @return
	 */
	public static boolean canSumWithoutDP(int[] arr, int target) {
		if(target == 0) {
			return true;
		}
		if(target < 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			if(canSumWithoutDP(arr, remainder)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * TimeComplexity O(n*m)
	 * Space Complexity O(m)
	 * @param arr
	 * @param target
	 * @param memo
	 * @return
	 */
	public static boolean canSumWithDP(int[] arr, int target, Map<Integer, Boolean> memo) {
		if(target == 0) {
			return true;
		}
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
		if(target < 0) {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			if(canSumWithDP(arr, remainder, memo)) {
				//memo.put(target, true);
				return true;
			}
		}
		memo.put(target, false);
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Can sum without DP : " + canSumWithoutDP(new int[] {5, 3, 4, 7},  7));
		System.out.println("Can sum without DP : " + canSumWithoutDP(new int[] {2, 3},  7));
		System.out.println("Can sum without DP : " + canSumWithoutDP(new int[] {2, 4},  7));
		System.out.println("Can sum without DP : " + canSumWithoutDP(new int[] {5, 3, 2},  8));	
		//System.out.println("Can sum without DP : " + canSumWithoutDP(new int[] {14, 7},  900));
		
		
		System.out.println("Can sum with DP : " + canSumWithDP(new int[] {5, 3, 4, 7},  7, new HashMap<Integer, Boolean>()));
		System.out.println("Can sum with DP : " + canSumWithDP(new int[] {2, 3},  7, new HashMap<Integer, Boolean>()));
		System.out.println("Can sum with DP : " + canSumWithDP(new int[] {2, 4},  7, new HashMap<Integer, Boolean>()));
		System.out.println("Can sum with DP : " + canSumWithDP(new int[] {5, 3, 2},  8, new HashMap<Integer, Boolean>()));	
		System.out.println("Can sum with DP : " + canSumWithDP(new int[] {14, 7},  900, new HashMap<Integer, Boolean>()));
	}
}
