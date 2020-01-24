package com.varun.test;

import java.math.BigInteger;

public class Test1 {
	
	static void nextMove(int n, int r, int c, String [] grid){
		int p = 0;
		int b = 0;
		for (int i = 0; i < grid.length; i++) {
			if(grid[i].contains("p") && grid[i].contains("b")){
				p = grid[i].indexOf("p");
				b = grid[i].indexOf("b"); 
				if(p < b){
					System.out.println("LEFT");
					return;
				}
				else{
					System.out.println("RIGHT");
					return;
				}
			}
			if(grid[i].contains("p")){
				p = i;
			}
			if(grid[i].contains("m")){
				b = i;
			}
			if(p < b){
				System.out.println("UP");
			}
			else{
				System.out.println("DOWN");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[5];
		array[0] = "-----";
		array[1] = "--m--";
		array[2] = "-----";
		array[3] = "p----";
	}

}
