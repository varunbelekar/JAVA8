package com.varun.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private static final Scanner sc = new Scanner(System.in);
	
	private int[][] adjacencyMatrix;
	
	public Graph(int vertices) {
		this.adjacencyMatrix = new int[vertices][vertices];
	}

	public void createGraphUsingAdjacencyMatrix(){
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				System.out.println("Enter edge info for node" + i + " and node " + j);
				adjacencyMatrix[i][j] = sc.nextInt();
			}
		}
	}
	public void printGraph(){
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public boolean areTwoNodesConnected(int node1, int node2){
		return adjacencyMatrix[node1][node2] == 1;
	}
	
	public List<Integer> getAdjacentNodes(int node){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < adjacencyMatrix[node].length; i++) {
			if(adjacencyMatrix[node][i] == 1){
				list.add(i);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of vertices");
		Graph graph = new Graph(sc.nextInt());
		graph.createGraphUsingAdjacencyMatrix();
		graph.printGraph();
		
		//Check two nodes connected
		System.out.println(graph.areTwoNodesConnected(0, 3));
		System.out.println(graph.areTwoNodesConnected(0, 2));
		
		//Get Adjacent nodes
		System.out.println(graph.getAdjacentNodes(0));
		System.out.println(graph.getAdjacentNodes(3));
	}
}
