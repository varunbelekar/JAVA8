package com.varun.dynamicprog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
	/**
	 * Time O(n^m * m)
	 * Space O(m)
	 * where n : arr.length(Numbers in array)
	 * m : Target Sum
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
	public static List<Integer> howSumWithoutDP(int[] arr, int target){
		if(target == 0) {
			return new ArrayList<Integer>();
		}
		if(target < 0) {
			return null;
		}
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			List<Integer> remainderList = howSumWithoutDP(arr, remainder);
			if(remainderList != null) {
				remainderList.add(arr[i]);
				return remainderList;
			}
		}
		
		return null;
	}
	
	/**
	 * Time O(n * m^2)
	 * Space O(m^2)
	 * 
	 * where n : arr.length(Numbers in array)
	 * m : Target Sum
	 * 
	 * @param arr
	 * @param target
	 * @param memo
	 * @return
	 */
	public static List<Integer> howSumWithDP(int[] arr, int target, Map<Integer, List<Integer>> memo){
		if(target == 0) {
			return new ArrayList<Integer>();
		}
		if(target < 0) {
			return null;
		}
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			List<Integer> remainderList = howSumWithDP(arr, remainder, memo);
			if(remainderList != null) {
				remainderList.add(arr[i]);
				memo.put(remainder, remainderList);
				return remainderList;
			}
		}
		memo.put(target, null);
		return null;
	}
	public static void main(String[] args) {
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {5, 3, 4, 7},  7));
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {2, 3},  7));
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {2, 4},  7));
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {5, 3, 2},  8));
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {2, 3, 5},  8));
		System.out.println("How sum without DP : " + howSumWithoutDP(new int[] {14, 7},  300));
		
		
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {5, 3, 4, 7},  7, new HashMap<Integer, List<Integer>>()));
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {2, 3},  7, new HashMap<Integer, List<Integer>>()));
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {2, 4},  7, new HashMap<Integer, List<Integer>>()));
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {5, 3, 2},  8, new HashMap<Integer, List<Integer>>()));
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {2, 3, 5},  8, new HashMap<Integer, List<Integer>>()));
		System.out.println("How sum with DP : " + howSumWithDP(new int[] {14, 7},  300, new HashMap<Integer, List<Integer>>()));
	}
}
