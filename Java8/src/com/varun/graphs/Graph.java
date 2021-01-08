package com.varun.graphs;

import java.util.List;

public interface Graph {
	void printGraph();
	
	boolean areTwoNodesConnected(int node1, int node2);
	
	List<Integer> getAdjacentNodes(int node);
	
	Graph addEdge(int node1, int node2);
}
