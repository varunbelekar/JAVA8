package com.varun.dynamicprog;

import java.util.HashMap;
import java.util.Map;

/**
 * @author varun
 * This class provides solution for the grid traveler problem.
 * Problem Statement : You are the traveler in 2*2 grid.You begin in 
 * the top left corner and your goal is to reach the bottom right corner.
 * You may move only bottom or right.
 */
public class GridTraveler {
	
	/**
	 * This function returns unique number of possible paths to get from starting position
	 * to end position in the m*n grid.
	 * Time complexity O(2^(n + m))
	 * Space complexity O(n + m)
	 * 
	 * @param m number of rows
	 * @param n number of columns
	 * @return unique number of possible paths to get from starting position 
	 * to ending position.
	 */
	public static int gridTravelWithoutDP(int m, int n) {
		if(m == 0 || n == 0) {
			return 0;
		}
		if(m == 1 && n == 1) {
			return 1;
		}
		return gridTravelWithoutDP(m - 1, n) + gridTravelWithoutDP(m, n - 1);
	}
	
	/**
	 * This function returns unique number of possible paths to get from starting position
	 * to end position in the m*n grid using DP.
	 * Time complexity O((n * m))
	 * Space complexity O(n + m)
	 * 
	 * @param m
	 * @param n
	 * @param memo
	 * @return
	 */
	public static long gridTravelWithDP(int m, int n, Map<String, Long> memo) {
		if(m == 0 || n == 0) {
			return 0;
		}
		if(m == 1 && n == 1) {
			return 1;
		}
		if(memo.containsKey(m + "," + n)) {
			return memo.get(m + "," + n);
		}
		memo.put(m + "," + n, gridTravelWithDP(m - 1, n, memo) + gridTravelWithDP(m, n - 1, memo));
		return memo.get(m + "," + n);
	}
	
	public static void main(String[] args) {
		//System.out.println("Grid Traveler without DP : " + gridTravelWithoutDP(18, 18));
		System.out.println("Grid Travler with DP : " + gridTravelWithDP(18, 18, new HashMap<String, Long>()));
	}
}
