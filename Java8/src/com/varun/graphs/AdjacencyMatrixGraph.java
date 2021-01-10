package com.varun.graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph implements Graph{
	
	private int[][] adjacencyMatrix;
	
	public AdjacencyMatrixGraph(int vertices) {
		this.adjacencyMatrix = new int[vertices][vertices];
	}
	
	@Override
	public void printGraph(){
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			for (int j = 0; j < adjacencyMatrix[i].length; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	@Override
	public boolean areTwoNodesConnected(int node1, int node2){
		return adjacencyMatrix[node1][node2] == 1;
	}
	
	@Override
	public List<Integer> getAdjacentNodes(int node){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < adjacencyMatrix[node].length; i++) {
			if(adjacencyMatrix[node][i] == 1){
				list.add(i);
			}
		}
		return list;
	}

	@Override
	public Graph addEdge(int node1, int node2) {
		adjacencyMatrix[node1][node2] = 1;
		return this;
	}

	@Override
	public void dfs(int startNode, boolean[] visited) {
		System.out.println(startNode);
		visited[startNode] = true;
		for (int i = 0; i < adjacencyMatrix[startNode].length; i++) {
			if(adjacencyMatrix[startNode][i] != 0 && ! visited[i]) {
				dfs(i, visited);
			}
		}
	}
	
	
	
}
