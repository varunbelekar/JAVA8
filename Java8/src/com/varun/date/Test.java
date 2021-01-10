package com.varun.date;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[][] adjMatrix = new int[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] != -1) {
				adjMatrix[arr[i] - 1][i] = 1;
			}
		}
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == -1) {
				ans = Math.max(ans, depthOfGraph(i, adjMatrix));
			}
		}
		System.out.println(ans);
		
		sc.close();
	}
	
	public static  int depthOfGraph(int startNode, int[][] adjacencyMatrix) {
		//System.out.println(startNode);
		int depth = 0;
		for (int i = 0; i < adjacencyMatrix[startNode].length; i++) {
			if(adjacencyMatrix[startNode][i] != 0 ) {
				depth = Math.max(depth,  depthOfGraph(i, adjacencyMatrix));
			}
		}
		return 1 + depth;
	}
	
}
