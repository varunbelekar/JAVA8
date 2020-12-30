package com.varun.dynamicprog;

import java.math.BigInteger;

public class Fibonacci {
	
	
	/**
	 * Calculates the nth fibonacci number.
	 * Runtime O(2^n)
	 * Space Complexity O(n)
	 * 
	 * @param n  The nth fibonacci number to find
	 * @return the nth fibonacci number
	 * 
	 */
	public static int fibonacciWithoutDP(int n) {
		if(n <= 2) {
			return 1;
		}
		return fibonacciWithoutDP(n - 1) + fibonacciWithoutDP(n - 2);
	}
	
	/**
	 * Calculates the nth fibonacci number.
	 * Runtime O(n)
	 * Space Complexity O(n)
	 * 
	 * @param n
	 * @param memo The memoised array to store the results.
	 * @return
	 */
	public static int fibonacciWithDP(int n, int[] memo) {
		if(n <= 2) {
			return 1;
		}
		if(memo[n - 1] != 0) {
			return memo[n - 1];
		}
		memo[n - 1] = fibonacciWithDP(n - 1, memo) + fibonacciWithDP(n - 2, memo);
		return memo[n - 1];
	}
	
	public static int fibonacciTabulation(int n){
		int[] table = new int[n + 1];
		table[1] = 1;
		for (int i = 0; i < n; i++) {
			table[i + 1] += table[i];
			if(i < n - 1){
				table[i + 2] += table[i];
			}
			
		}
		return table[n];
	}

    public static BigInteger fibonacciModified(Integer t1, Integer t2, int n, BigInteger[] memo) {
        if(n == 1) {
            return BigInteger.valueOf(t1.intValue());
        }
        if(n == 2) {
            return BigInteger.valueOf(t2.intValue());
        }
        if(memo[n - 1] != null) {
            return memo[n - 1];
        }
        memo[n - 1] = fibonacciModified(t1, t2,n - 2, memo).add(fibonacciModified(t1, t2,n - 1,  memo).pow(2));
        return memo[n - 1];
    }
	
	public static void main(String[] args) {
		//System.out.println("Fibo without DP : " + fibonacciWithoutDP(50));
		System.out.println("Fibo with DP : " + fibonacciWithDP(8, new int[50]));
        System.out.println("Modified Fibo : " + fibonacciModified(0, 1, 20, new BigInteger[20]).toString());
        System.out.println("Fibo without DP : " + fibonacciTabulation(8));
	}
}
