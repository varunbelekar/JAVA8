package com.varun.dynamicprog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BestSum {
	/**
	 * Time O(n^m * m)
	 * Space O(m ^ 2)
	 * where n : arr.length(Numbers in array)
	 * m : Target Sum
	 * 
	 * @param arr
	 * @param target
	 * @return
	 */
	public static List<Integer> bestSumWithoutDP(int[] arr, int target){
		if(target == 0) {
			return new ArrayList<Integer>();
		}
		if(target < 0) {
			return null;
		}
		List<Integer> bestCombination = null;
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			List<Integer> currentCombination = bestSumWithoutDP(arr, remainder);
			if(currentCombination != null ) {
				currentCombination.add(arr[i]);
				if(bestCombination == null || bestCombination.size() > currentCombination.size()) {
					bestCombination = currentCombination;
				}
			}
		}
		return bestCombination;
	}
	
	public static List<Integer> bestSumWithDP(int[] arr, int target, Map<Integer, List<Integer>> memo){
		if(target == 0) {
			return new ArrayList<Integer>();
		}
		if(target < 0) {
			return null;
		}
		if(memo.containsKey(target)) {
			return memo.get(target);
		}
		List<Integer> bestCombination = null;
		for (int i = 0; i < arr.length; i++) {
			int remainder = target - arr[i];
			List<Integer> currentCombination = bestSumWithDP(arr, remainder, memo);
			if(currentCombination != null ) {
				currentCombination.add(arr[i]);
				memo.put(target, currentCombination);
				if(bestCombination == null || bestCombination.size() > currentCombination.size()) {
					bestCombination = currentCombination;
				}
			}
			memo.put(target, currentCombination);
		}
		return bestCombination;
	}
	
	public static void main(String[] args) {
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {5, 3, 4, 7},  7));
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {2, 3},  7));
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {2, 4},  7));
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {5, 3, 2},  8));
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {5, 3, 2},  8));
		System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {1, 4, 5},  8));
		//System.out.println("Best sum without DP : " + bestSumWithoutDP(new int[] {14, 7},  900));
		
		
		System.out.println("How sum with DP : " + bestSumWithDP(new int[] {5, 3, 4, 7},  7, new HashMap<Integer, List<Integer>>()));
		
		System.out.println("Best sum with DP : " + bestSumWithDP(new int[]{7, 14}, 300, new HashMap<Integer, List<Integer>>()));
	}
}
